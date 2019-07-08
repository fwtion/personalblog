package com.cogn.personalblog.controller;

import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.pojo.Comment;
import com.cogn.personalblog.service.IGetBlogService;
import com.cogn.personalblog.service.IGetByIdDetail;
import com.cogn.personalblog.service.IGetCommentService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
@Controller
public class PersonIndexController {
    @Autowired
    private IGetBlogService getBlogService;

    @Autowired
    private IGetByIdDetail getByIdDetail;

    @Autowired
    private IGetCommentService getCommentService;
    @RequestMapping("/detail/{authorId}")
    public String detail(@PathVariable int authorId, Model model){
        Article art = getByIdDetail.getByIdDetail(authorId);
        model.addAttribute("art",art);
        List<Comment> comment = getCommentService.getComment(authorId);
        model.addAttribute("comment",comment);
        return "blog";

    }
}
