package com.cogn.personalblog.service;

import com.cogn.personalblog.pojo.Comment;

import java.util.List;

public interface IGetCommentService {
    List<Comment> getComment(int authorId);
}
