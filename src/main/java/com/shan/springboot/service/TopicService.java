package com.shan.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shan.springboot.dao.TopicRepository;
import com.shan.springboot.topic.Topic;

@Service
public class TopicService {
    
  /*  private List<Topic> topics = Arrays.asList(
            new Topic(1, "Spring", "Spring desc"),
            new Topic(2, "java", "core java"),
            new Topic(3, "Struts", "Struts desc")
        );*/
    
    
    @Autowired
    private TopicRepository topicRepository;
    
    public List<Topic> getAllTopics(){
        return (List<Topic>) topicRepository.findAll();
    }
    
    public Topic getTopic(int id) {
        return topicRepository.findOne(id);
    }
    
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }
    
    
    public void updateTopic(Topic topic){
        topicRepository.save(topic);
    }
    
    public void deleteTopic(int id){
        topicRepository.delete(id);
    }
}
