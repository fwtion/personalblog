package com.cogn.personalblog.dao;

import com.cogn.personalblog.pojo.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BlogManageMapper {
    /*
        查询博客列表
     */
    @Select("select * from article")
    List<Article> blogManage();
    /*
        修改博客内容
     */
    @Update("update article set title=#{title},authorName=#{authorName},content=#{content} where authorId=#{authorId}")
    int updateBlog(int authorId,String authorName,String title,String content);

    /*
        删除博客
     */
    @Delete("delete from article where authorId = #{authorId}")
    int deleteBlog(int authorId);
}
