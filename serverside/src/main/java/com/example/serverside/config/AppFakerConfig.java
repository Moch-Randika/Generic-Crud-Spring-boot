package com.example.serverside.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.javafaker.Faker;


@Configuration
public class AppFakerConfig {
    
    @Bean
    Faker faker(){
        return new Faker();
    }
}   
