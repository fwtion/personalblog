package com.cogn.personalblog.service.impl;


import com.cogn.personalblog.dao.GetCommentMapper;
import com.cogn.personalblog.pojo.Comment;
import com.cogn.personalblog.service.IGetCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("getComment")
public class GetCommentImplService implements IGetCommentService {
    @Autowired
    private GetCommentMapper getCommentMapper;

    @Override
    public List<Comment> getComment(int authorId){
        return getCommentMapper.getComment(authorId);
    }
}
