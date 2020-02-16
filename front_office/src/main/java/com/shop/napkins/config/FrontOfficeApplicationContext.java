package com.shop.napkins.config;

import com.shop.napkins.common.components.service.ProductCategoryService;
import com.shop.napkins.secured.components.service.TestService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FrontOfficeApplicationContext {
    @Bean
    TestService2 getTestService2() {
        return new TestService2();
    }

    @Bean
    ProductCategoryService getProductCategoryService() {
        return new ProductCategoryService();
    }
}