package com.tpe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration //this the name main reference
@EnableWebMvc //indication that we will work with spring mvc
@ComponentScan("com.tpe")
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver resolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");// indicating location of view folder
        resolver.setSuffix(".jsp");  //
        return resolver;
    }

    //setting the location of our resources (such as css, image. etc)
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("resources/**").
                addResourceLocations("/resources").setCachePeriod(0);
    }
}
