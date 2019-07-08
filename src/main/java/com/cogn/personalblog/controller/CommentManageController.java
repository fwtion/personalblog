package com.cogn.personalblog.controller;

import com.cogn.personalblog.pojo.Comment;
import com.cogn.personalblog.service.ICommentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CommentManageController {

    @Autowired
    private ICommentManageService commentManageService;


    /*
    获取评论列表
     */
    @RequestMapping("/commentManger")
    public String commentManger(Model map){
        List<Comment>comments = commentManageService.commentManage();
        map.addAttribute("comments",comments);
        System.out.println(comments.size());
        return "admin/comment_list";
    }
    /*
    删除评论
     */
    @RequestMapping(value = "/deleteComment/{comId}")
    public String deleteComment(@PathVariable("comId") int comId){
        commentManageService.deleteComment(comId);
        System.out.println(comId);
        return "redirect:/commentManger";
    }

}
