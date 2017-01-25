package com.shan.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shan.springboot.service.TopicService;

@RestController
public class TopicController {
    
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }
    
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable int id){
        return topicService.getTopic(id);
        
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/topic/{id}")
    public void updateTopic(@RequestBody Topic topic){
        topicService.updateTopic(topic);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
    public void deleteTopic(@PathVariable int id){
        topicService.deleteTopic(id);
    }

}