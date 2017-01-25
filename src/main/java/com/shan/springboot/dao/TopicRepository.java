package com.shan.springboot.dao;

import org.springframework.data.repository.CrudRepository;

import com.shan.springboot.topic.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer>{
    
}
