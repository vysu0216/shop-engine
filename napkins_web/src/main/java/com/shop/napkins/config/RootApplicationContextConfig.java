package com.shop.napkins.config;

import com.shop.napkins.secured.components.service.CommonWebApplicationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackageClasses = { RootApplicationContextConfig.class })
public class RootApplicationContextConfig {

    @Bean
    CommonWebApplicationService getTestService() {
        return new CommonWebApplicationService();
    }

}
