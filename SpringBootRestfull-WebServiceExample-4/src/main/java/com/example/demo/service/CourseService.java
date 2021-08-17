package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;

@Service
public interface CourseService {
	

	public List<Course> getCourses();

	public Course getCourse(long courseId);

	public Course addCourse(Course course);
	
	public Course deleteCourse(Course course);
	

	

}
