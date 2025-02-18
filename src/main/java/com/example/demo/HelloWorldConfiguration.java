package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class HelloWorldConfiguration {

    public static record Person(String name, int age){};
    public static record Person2(String name, int age, Address address){};

    public static record Address(String street, String city){};

    @Bean
    public String  name(){
        return "Anurag";
    }
    @Bean
    public int age(){
        return 27;
    }

    @Bean
    @Primary
    public Person personMethodCall(){
        return new Person(name(),age());
    }

    @Bean
    public Person personParametersCall(String name, int age){
        return new Person(name,age);
    }

    @Bean
    public Person2 personParamAddress(String name, int age, @Qualifier("test2") Address test){
        return new Person2(name,age,test);
    }

    @Bean
    @Qualifier("test")
    public Address address(){
        return new Address("Baker Stree","London");
    }

    @Bean
    @Qualifier("test2")
    public Address address2(){
        return new Address("Baker Street 2","London");
    }


}
