package com.cogn.personalblog.dao;

import com.cogn.personalblog.pojo.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CommentManageMapper {
    @Select("select * from comment")
    List<Comment> commentManage();

    @Delete("delete from comment where comId=#{comId}")
    int deleteComment(int comId);
}
