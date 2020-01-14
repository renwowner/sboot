package com.ykf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;


@SpringBootApplication
public class ApplicationStart {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ApplicationStart.class);
//		String id = context.getEnvironment().getProperty("kk.ip");
		ConfigurableEnvironment pros = context.getEnvironment();
		System.out.println("adfad");
		
	}
	
}
