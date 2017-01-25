package com.shan.springboot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.shan.springboot.topic.Topic;



public class TopicTest {
    
    @Test
    public void verifySetId() {
        int id= 2;
        Topic topic = new Topic();
        topic.setId(id);
        assertEquals(id, topic.getId());
    }

}
