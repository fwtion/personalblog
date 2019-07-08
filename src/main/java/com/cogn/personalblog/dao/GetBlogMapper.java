package com.cogn.personalblog.dao;

import com.cogn.personalblog.pojo.Article;

import java.util.List;

public interface GetBlogMapper {
    List<Article> getBlog();
}
