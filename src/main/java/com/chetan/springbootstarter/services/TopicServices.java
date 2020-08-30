package com.chetan.springbootstarter.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chetan.springbootstarter.model.Topic;
import com.chetan.springbootstarter.repository.TopicRepository;

@Service
public class TopicServices {
	
	@Autowired
	private TopicRepository topicRepository;
	
//	private List<Topic> topics = new ArrayList<>(Arrays.asList(
//								new Topic("spring","Spring Framework","Spring framework discription"),
//								new Topic("java","core java j2se","core java discription"),
//								new Topic("hibernate","Hibernate ORM Framework","Hibernate ORM framework discription"),
//								new Topic("restful","Restful web service","Restful web service discription")
//								));
//
//	public List<Topic> getAllTopics(){
//		return topics;
//	}
//	
//	public Topic getTopic(String id){
//		 return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//	}
//
//	public void addTopic(Topic topic) {
//		topics.add(topic);
//	}
//
//	public void updateTopic(String id, Topic topic) {
//		for(int i = 0;i < topics.size();i++){
//			Topic t = topics.get(i);
//			if(t.getId().equals(id)){
//				topics.set(i, topic);
//				return;
//			}
//		}
//		
//	}
//
//	public void removeTopic(String id) {
//		topics.removeIf(t -> t.getId().equals(id));
//		//topics.forEach(System.out::println);
//	}
		
	public List<Topic> getAllTopics(){
		
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public Topic getTopic(String id){
		 //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
		
	}

	public void removeTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
	
}
