package com.tpe;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override

    //DB and Hibernate configuration
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }


    @Override
    //MVC configuration
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class
        };
    }

    @Override
    //servlet and url configuration
    protected String[] getServletMappings() {
        return new String[]{"/"}; //all requests will received by this servlet
    }
}
