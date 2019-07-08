package com.cogn.personalblog.service.impl;

import com.cogn.personalblog.dao.CommentManageMapper;
import com.cogn.personalblog.pojo.Comment;
import com.cogn.personalblog.service.ICommentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("commentManagerService")
public class CommentManageServiceImpl implements ICommentManageService {
    @Autowired
    private CommentManageMapper commentManageMapper;
    @Override
    public List<Comment> commentManage(){
        return commentManageMapper.commentManage();
    }

    @Override
    public int deleteComment(int comId){
        return commentManageMapper.deleteComment(comId);
    }
}
