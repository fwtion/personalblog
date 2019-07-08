package com.cogn.personalblog.controller;

import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IBlogManageService;
import com.cogn.personalblog.service.IDeleteBlogService;
import com.cogn.personalblog.service.IGetByIdDetail;
import com.cogn.personalblog.service.IUpdateBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BlogManageController {
    @Autowired
    private IBlogManageService blogManageService;

    @Autowired
    private IGetByIdDetail getByIdDetail;

    @Autowired
    private IUpdateBlogService updateBlogService;

    @Autowired
    private IDeleteBlogService deleteBlogService;
    /*
    博客文章管理首页
    这里调用了游客访问主页时的服务接口，因为数据操作都一样，所以没必要再写一遍
     */
    @RequestMapping("/blogManage")
    public String showAllArticle(Model map){
        List<Article> articles =  blogManageService.blogManage();
        map.addAttribute("articles",articles);
        return "admin/article_list";
    }
    /*
        点击里表中某个编辑按钮时，跳转到编辑页面
    */
    @RequestMapping(value = "commentEdit/{authorId}",method = RequestMethod.GET)
    public String commentEdit(@PathVariable int authorId, Model map){
       Article article = getByIdDetail.getByIdDetail(authorId);
       String content = article.getContent();
       System.out.println(content);
       map.addAttribute("article",article);
        return "admin/article_update";
    }
    /*
    修改已发布的博客
     */

    @RequestMapping("/updateblog")
    public String updateBlog(@RequestParam("authorId")int authorId,@RequestParam("authorName")String authorName,
                             @RequestParam("title")String title,@RequestParam("content") String content) {
        updateBlogService.updateBlog(authorId, authorName, title, content);

        return "redirect:/blogManage";
    }

    /*
    删除博客
     */
    @RequestMapping("/deleteBlog/{authorId}")
    public String deleteBlog(@PathVariable int authorId,Model map){
        deleteBlogService.deleteBlog(authorId);
        return "redirect:/blogManage";
    }




}
