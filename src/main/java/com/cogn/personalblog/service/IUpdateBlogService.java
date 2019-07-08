package com.cogn.personalblog.service;

public interface IUpdateBlogService {
    int  updateBlog(int authorId,String authorName,String title,String content);
}
