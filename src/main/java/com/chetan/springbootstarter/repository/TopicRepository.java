package com.chetan.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.chetan.springbootstarter.model.Topic;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
