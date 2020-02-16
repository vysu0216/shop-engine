package com.shop.napkins.config.init;

import com.shop.napkins.config.servlet.NormalServletContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

public class NormalDispatcherServletInitializer extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext annotationConfigApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigApplicationContext.register(NormalServletContext.class);
        return annotationConfigApplicationContext;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/api/v1/normal/*"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
