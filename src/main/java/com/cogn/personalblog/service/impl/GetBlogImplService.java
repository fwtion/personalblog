package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.GetBlogMapper;
import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IGetBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("getBlogService")
public class GetBlogImplService implements IGetBlogService {
    @Autowired
    private GetBlogMapper getBlogMapper;
    @Override
    public List<Article> getBlog(){
        return getBlogMapper.getBlog();
    }
}
