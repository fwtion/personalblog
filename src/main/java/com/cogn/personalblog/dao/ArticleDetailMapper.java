package com.cogn.personalblog.dao;

import com.cogn.personalblog.pojo.Article;

public interface ArticleDetailMapper {
    Article getByIdDetail(int authorId);
}
