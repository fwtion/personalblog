package com.cogn.personalblog.service;

import com.cogn.personalblog.pojo.Article;
import com.github.pagehelper.Page;

public interface IByPageService {
    Page<Article> getBlogByPage();
}
