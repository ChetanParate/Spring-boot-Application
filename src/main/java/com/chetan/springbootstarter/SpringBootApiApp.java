package com.chetan.springbootstarter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApiApp {
	
	private static Logger logger = LoggerFactory.getLogger(SpringBootApiApp.class);

	public static void main(String[] args) {
		
		logger.info("Spring boot application starting....");		
		SpringApplication.run(SpringBootApiApp.class, args);
		logger.info("Spring boot application started....");
		
		

	}

}
