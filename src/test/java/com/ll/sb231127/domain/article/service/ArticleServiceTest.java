package com.ll.sb231127.domain.article.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.ll.sb231127.domain.article.entity.Article;
import com.ll.sb231127.global.rsData.RsData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;
@SpringBootTest
@ActiveProfiles("test")
@Transactional
class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;

    @DisplayName("[게시글 작성] 첫번째 게시글의 id는 0이다.")
    @Test
    void t1() {
        RsData<Article> writeRs = articleService.write("제목", "내용");
        Article article = writeRs.getData();

        assertThat(article.getId())
                .isGreaterThan(0L);
    }


}