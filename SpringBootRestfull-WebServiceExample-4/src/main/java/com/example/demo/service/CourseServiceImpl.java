package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Course;
@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(145,"core java","this course basic of java"));
		list.add(new Course(146,"Spring boot","Creating Rest Api"));
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c= null;
		for (Course course : list) {
			if(course.getId() == courseId) {
				c =course;
				break;
			}
		}
		return c;
			
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	@Override
	public Course deleteCourse(Course course) {
		// TODO Auto-generated method stub
		return course;
	}

}
