package com.cogn.personalblog.service;

import com.cogn.personalblog.pojo.Comment;

import java.util.List;

public interface ICommentManageService {

    List<Comment> commentManage();

    int deleteComment(int comId);
}
