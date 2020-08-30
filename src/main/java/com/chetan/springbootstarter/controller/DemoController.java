package com.chetan.springbootstarter.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chetan.springbootstarter.model.Topic;

@RestController
public class DemoController {
	
	Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopics(){
		logger.info("topic API called : /topic");
		return Arrays.asList(new Topic("spring","Spring Framework","Spring framework discription"),
				new Topic("core java","core java j2se","core java discription"),
				new Topic("hibernate","Hibernate ORM Framework","Hibernate ORM framework discription"),
				new Topic("restful","Restful web service","Restful web service discription"));
	}
	
	@RequestMapping("/")
	public String getMessage(){
		logger.info("Spring Boot App working fine..");
		return "Hey Chetan, Hows you doing ? This is your first springboot application";
	}

}
