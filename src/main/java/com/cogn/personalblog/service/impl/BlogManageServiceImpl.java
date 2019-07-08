package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.BlogManageMapper;
import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IBlogManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("blogManage")
public class BlogManageServiceImpl implements IBlogManageService {
    @Autowired
    private BlogManageMapper blogManageMapper;

    @Override
    public List<Article> blogManage(){
        return blogManageMapper.blogManage();
    }
}
