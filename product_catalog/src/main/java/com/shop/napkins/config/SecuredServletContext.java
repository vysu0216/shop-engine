package com.shop.napkins.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.shop.napkins.secured.components.*"})
public class SecuredServletContext {

    @Bean
    RequestMappingHandlerAdapter getRequestMappingHandlerAdapter(){
        RequestMappingHandlerAdapter requestMappingHandlerAdapter = new RequestMappingHandlerAdapter();
        List massageConverters = new ArrayList();
        massageConverters.add(new MappingJackson2HttpMessageConverter());
        massageConverters.add(new StringHttpMessageConverter());
        massageConverters.add(new ByteArrayHttpMessageConverter());
        massageConverters.add(new SourceHttpMessageConverter());
        requestMappingHandlerAdapter.setMessageConverters(massageConverters);
        return requestMappingHandlerAdapter;
    }
}
