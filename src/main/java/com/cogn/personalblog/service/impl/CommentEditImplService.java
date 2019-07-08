package com.cogn.personalblog.service.impl;


import com.cogn.personalblog.dao.CommentEditMapper;
import com.cogn.personalblog.pojo.Comment;
import com.cogn.personalblog.service.ICommentEditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("commentEditService")
public class CommentEditImplService implements ICommentEditService {
    @Autowired
    private CommentEditMapper commentEditMapper;
    @Override
    public int commentEdit(Comment comment){
        return commentEditMapper.commentEdit(comment);
    }

}
