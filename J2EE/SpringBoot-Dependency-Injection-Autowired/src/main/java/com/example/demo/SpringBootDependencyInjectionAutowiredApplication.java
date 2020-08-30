package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.example.demo" })

public class SpringBootDependencyInjectionAutowiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cxt=SpringApplication.run(SpringBootDependencyInjectionAutowiredApplication.class, args);
		
		Laptop lp=cxt.getBean(Laptop.class); 
		lp.Display();
		
	}

}
