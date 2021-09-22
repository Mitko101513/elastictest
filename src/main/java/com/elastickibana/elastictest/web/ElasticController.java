package com.elastickibana.elastictest.web;

import com.elastickibana.elastictest.model.Article;
import com.elastickibana.elastictest.repository.ArticleRepository;
import com.elastickibana.elastictest.service.ArticleService;
import org.elasticsearch.client.Response;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "api/elastic", produces = MediaType.APPLICATION_JSON_VALUE)
public class ElasticController {

    private final ArticleService articleService;

    public ElasticController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping(path = "/getMessage")
    public String getMessage() {
        return "ElasticTEst";
    }

    @GetMapping(path = "/dummyData")
    public Article dummyData() {

        return articleService.importDummyData();
    }
}
