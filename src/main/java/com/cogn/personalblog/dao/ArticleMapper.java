package com.cogn.personalblog.dao;

import com.cogn.personalblog.pojo.Article;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ArticleMapper {
        /**
         * 插件 分页  查询表中所有字段
         */
        Page<Article> getBlogByPage();

}

