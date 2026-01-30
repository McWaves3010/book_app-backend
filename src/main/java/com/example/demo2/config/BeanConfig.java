package com.example.demo2.config;

import com.example.demo2.services.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public BookService bookService(){
        return new BookService();
    }
}
