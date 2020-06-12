package com.chetan.springbootstarter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetan.springbootstarter.model.Course;
import com.chetan.springbootstarter.repository.CourseRepository;

@Service
public class CourseServices {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourse(String topicId){
		
		List<Course> course = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(course::add);
		return course;
		
	}
	
	public Course getCourse(String id){
		 //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course topic) {
		
		courseRepository.save(topic);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
		
	}

	public void removeTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
	
}
