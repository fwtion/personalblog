package com.cogn.personalblog.service.impl;


import com.cogn.personalblog.dao.BlogManageMapper;
import com.cogn.personalblog.service.IDeleteBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("deleteBlogService")
public class deleteBlogServiceImpl implements IDeleteBlogService {
    @Autowired
    private BlogManageMapper blogManageMapper;

    @Override
    public int deleteBlog(int authorId){
        return blogManageMapper.deleteBlog(authorId);
    }
}
