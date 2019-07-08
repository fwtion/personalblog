package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.ArticleMapper;
import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IByPageService;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("byPageService")
public class ByPageServiceImpl implements IByPageService {
    @Autowired
    private ArticleMapper articleMapper;
    public Page<Article> getBlogByPage(){
        return articleMapper.getBlogByPage();
    }
}
