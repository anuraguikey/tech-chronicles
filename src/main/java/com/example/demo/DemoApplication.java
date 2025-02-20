package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		try(var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){

			System.out.println(context.getBean(HelloWorldConfiguration.Person.class));
			System.out.println(context.getBean("personParamAddress"));

			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out ::println);
		}


	}

}
