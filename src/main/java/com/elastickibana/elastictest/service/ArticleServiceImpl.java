package com.elastickibana.elastictest.service;

import com.elastickibana.elastictest.model.Article;
import com.elastickibana.elastictest.model.Author;
import com.elastickibana.elastictest.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleServiceImpl(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Article importDummyData() {
        Article article = new Article("Spring Data Elasticsearch");
        article.setAuthors(Arrays.asList(new Author("John Smith"), new Author("John Doe")));
        return articleRepository.save(article);
    }
}
