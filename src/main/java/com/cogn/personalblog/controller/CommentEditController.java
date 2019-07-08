package com.cogn.personalblog.controller;

import com.cogn.personalblog.pojo.Comment;
import com.cogn.personalblog.service.ICommentEditService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
@Controller
public class CommentEditController {
    @Autowired
    private ICommentEditService commentEditService;




    @RequestMapping(value = "/commentEdit",method = {RequestMethod.POST,RequestMethod.GET})
    public String commentEdit(@RequestParam("commentName") String commentName, @RequestParam("commentContent") String commentContent, @RequestParam("authorId") int authorId, Model map){
        Comment comment = new Comment(commentName,commentContent,authorId);
        map.addAttribute("comment",comment);
        int i = commentEditService.commentEdit(comment);
        return "redirect:/detail/"+authorId;
    }
//    @RequestMapping(value = "commentEdit",method = {RequestMethod.GET})
//    public String commentEdit(@PathVariable int authorId,Model map){
//        map.addAttribute("authorId",authorId);
//        System.out.println(authorId);
//        return null;
//    }

}
