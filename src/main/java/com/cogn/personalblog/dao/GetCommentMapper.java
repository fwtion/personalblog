package com.cogn.personalblog.dao;

import com.cogn.personalblog.pojo.Comment;

import java.util.List;

public interface GetCommentMapper {
    List<Comment> getComment(int authorId);
}
