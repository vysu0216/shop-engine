package com.shop.napkins.config;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductCatalogApplicationContext {
    @Bean
    public Logger logger(){
        return LoggerFactory.getLogger("application");
    }
}