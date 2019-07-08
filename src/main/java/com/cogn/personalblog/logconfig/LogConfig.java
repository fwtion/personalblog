package com.cogn.personalblog.logconfig;


import com.cogn.personalblog.pojo.Article;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public Article logMethod() {
        LOG.info("==========print log==========");
        return new Article();
    }
}
