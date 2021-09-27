package com.elastickibana.elastictest.service;

import com.elastickibana.elastictest.model.Article;

public interface ArticleService {

    Article importDummyData();

    Article findByTitle(String title);
}
