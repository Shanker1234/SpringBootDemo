package com.shan.springboot.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CourseService {
    
  /*  private List<course> courses = Arrays.asList(
            new course(1, "Spring", "Spring desc"),
            new course(2, "java", "core java"),
            new course(3, "Struts", "Struts desc")
        );*/
    
    
    @Autowired
    private CourseRepository courseRepository;
    
    public List<Course> getAllCourses(int topicId){
        return (List<Course>) courseRepository.findByTopicId(topicId);
    }
    
    public Course getCourse(int id) {
        return courseRepository.findOne(id);
    }
    
    public void addCourse(Course course) {
        courseRepository.save(course);
    }
    
    
    public void updateCourse(Course course){
        courseRepository.save(course);
    }
    
    public void deleteCourse(int id){
        courseRepository.delete(id);
    }
}
