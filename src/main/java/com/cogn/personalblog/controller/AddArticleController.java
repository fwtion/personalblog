package com.cogn.personalblog.controller;

import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IAddArticleService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Mapper
@Controller
public class AddArticleController {

    @Autowired
    private IAddArticleService addArticle;

    @RequestMapping("/admin")
    public String adminIndex(){
        return "admin/index";
    }

    @RequestMapping("/addArticleindex")
    public String addAticleindex(){
        return "admin/article_edit";
    }

    @RequestMapping(value = "/addArticle",method = RequestMethod.POST)
    public String addArticle(@RequestParam("authorName")String authorName,
                             @RequestParam("title")String title, @RequestParam("content")String content) {
        Article art = new Article(authorName,title,content);
        addArticle.addArticle(art);
        return null;



    }


}
