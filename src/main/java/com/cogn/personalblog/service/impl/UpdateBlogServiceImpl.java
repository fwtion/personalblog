package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.BlogManageMapper;
import com.cogn.personalblog.service.IUpdateBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("updateBlog")
public class UpdateBlogServiceImpl implements IUpdateBlogService{

    @Autowired
    private BlogManageMapper blogManageMapper;

    @Override
    public int updateBlog(int authorId,String authorName,String title,String content){
        return blogManageMapper.updateBlog(authorId,authorName,title,content);
    }
}
