package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class HelloWorldConfiguration {
    record Person(String name, int age){};

    @Bean
    public String  name(){
        return "Anurag";
    }
    @Bean
    public int age(){
        return 27;
    }
    @Bean
    public Person personMethodCall(){
        return new Person(name(),age());
    }

    @Bean
    public Person personParametersCall(String name, int age){
        return new Person(name,age);
    }
}
