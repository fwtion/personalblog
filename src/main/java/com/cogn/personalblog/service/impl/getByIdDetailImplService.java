package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.ArticleDetailMapper;
import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IGetByIdDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("getByIdDetail")
public class getByIdDetailImplService implements IGetByIdDetail {
    @Autowired
    private ArticleDetailMapper articleDetailMapper;
    @Override
    public Article getByIdDetail(int authorId){
        return articleDetailMapper.getByIdDetail(authorId);
    }
}
