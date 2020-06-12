package com.chetan.springbootstarter.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chetan.springbootstarter.model.Course;
import com.chetan.springbootstarter.model.Topic;
import com.chetan.springbootstarter.services.CourseServices;

@RestController
@RequestMapping("/springboot/webapi")
public class CourseController {
	
	private Logger logger = LoggerFactory.getLogger(CourseController.class);
	
	@Autowired
	private CourseServices courseService;
	
	@RequestMapping("/topic/{id}/courses")
	public List<Course> getAllCourse(@PathVariable String id){
		logger.info("getAll course method called for id :"+id);
		return courseService.getAllCourse(id);
	}
	
	@RequestMapping("/topic/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id){
		logger.info("get course method called for id :"+id);
		return courseService.getCourse(id);
	}
		
	@RequestMapping(method=RequestMethod.POST,value="/topic/{topicId}/courses")
	//@PostMapping("/topic")
	public void addCourse(@RequestBody Course course,@PathVariable String topicId){
		logger.info("addCourse method called for topicId :"+topicId);
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@PutMapping("/topic/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id){
		logger.info("updateCourse method called for topicId: {} with courses id : {}"+id,topicId);
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@DeleteMapping("/topic/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable String id){
		logger.info("deleteCourse method called for topicId with courses id : {}"+id);
		courseService.removeTopic(id);
	}

}
