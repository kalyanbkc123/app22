package com.durgasoft;

import org.springframework.context.ApplicationContext;
import com.durgasoft.beans.Course;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
        Course course = (Course) applicationContext.getBean("course");
        course.getCourseDetails();
    }
}