package com.chetan.springbootstarter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.chetan.springbootstarter.model.Course;

public interface CourseRepository extends CrudRepository<Course,String> {
	
	public List<Course> findByTopicId(String topicId);
}
