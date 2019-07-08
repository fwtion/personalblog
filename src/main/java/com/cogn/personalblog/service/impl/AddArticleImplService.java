package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.AddArticleMapper;
import com.cogn.personalblog.pojo.Article;
import com.cogn.personalblog.service.IAddArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("addArticleService")
public class AddArticleImplService implements IAddArticleService {
    @Autowired
    private AddArticleMapper addArticleMapper;
    @Override
    public int addArticle(Article art){
        return addArticleMapper.addArticle(art);
    }

}
