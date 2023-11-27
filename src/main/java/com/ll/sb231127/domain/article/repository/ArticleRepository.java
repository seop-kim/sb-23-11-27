package com.ll.sb231127.domain.article.repository;

import com.ll.sb231127.domain.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
