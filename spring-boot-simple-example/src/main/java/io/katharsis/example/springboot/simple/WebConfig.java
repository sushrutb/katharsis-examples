package io.katharsis.example.springboot.simple;

import io.katharsis.example.springboot.simple.interceptors.DummyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private DummyInterceptor dummyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("In addInterceptors");
        registry.addInterceptor(dummyInterceptor);
    }
}