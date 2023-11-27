package com.ll.sb231127.domain.article.service;

import com.ll.sb231127.domain.article.entity.Article;
import com.ll.sb231127.domain.article.repository.ArticleRepository;
import com.ll.sb231127.global.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ArticleService {

    private final ArticleRepository articleRepository;

    public RsData<Article> write(String title, String body) {
        Article article = Article.builder()
                .title(title)
                .body(body)
                .build();

        articleRepository.save(article);

        return RsData.of("200", "%d번 게시글 작성이 완료되었습니다.".formatted(article.getId()), article);
    }
}
