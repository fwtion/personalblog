package com.cogn.personalblog.controller;

import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IByPageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BlogByPageController {
    @Autowired
    private IByPageService iByPageService;
    @GetMapping("/blogIndex")
    public String lists(@RequestParam(defaultValue = "1") int pageNo, @RequestParam(defaultValue = "5") int pageSize, Model map){
        PageHelper.startPage(pageNo,pageSize);
        PageInfo<Article> pageInfo= new PageInfo<>(iByPageService.getBlogByPage());
        System.out.println(pageInfo);
        map.addAttribute("pageInfo",pageInfo);
        return "index";
    }
}
