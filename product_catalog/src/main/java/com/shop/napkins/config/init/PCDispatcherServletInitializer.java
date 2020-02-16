package com.shop.napkins.config.init;

import com.shop.napkins.config.SecuredServletContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class PCDispatcherServletInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(SecuredServletContext.class);
        ctx.setServletContext(container);

        ServletRegistration.Dynamic servlet = container.addServlet(
                "productCatalogDispatcherServlet", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(2);
        servlet.addMapping("/api/v1/product-catalog/*");
    }

    protected WebApplicationContext createServletApplicationContext() {
        return null;
    }

    protected String[] getServletMappings() {
        return null;
    }

    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

}
