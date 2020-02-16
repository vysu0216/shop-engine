package com.shop.napkins.config.init;

import com.shop.napkins.config.CommonServletContext;
import com.shop.napkins.config.SecuredServletContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;

public class FODispatcherServletInitializer implements WebApplicationInitializer {

    public void onStartup(ServletContext container) throws ServletException {
        AnnotationConfigWebApplicationContext ctx
                = new AnnotationConfigWebApplicationContext();
        ctx.register(SecuredServletContext.class, CommonServletContext.class);
        ctx.setServletContext(container);

        ServletRegistration.Dynamic servlet = container.addServlet(
                "frontOfficeDispatcherServlet", new DispatcherServlet(ctx));
        servlet.setLoadOnStartup(2);
        servlet.addMapping("/api/front-office/*");
    }

    protected WebApplicationContext createServletApplicationContext() {
        /*AnnotationConfigWebApplicationContext annotationConfigApplicationContext = new AnnotationConfigWebApplicationContext();
        annotationConfigApplicationContext.register(SecuredServletContext.class);
        return annotationConfigApplicationContext;
        */
        return null;
    }

    protected String[] getServletMappings() {
        //return new String[]{"/api/secured/*"};
        return null;
    }

    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }

}
