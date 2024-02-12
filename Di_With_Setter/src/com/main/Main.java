package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Class_path="/com/resources/ApplicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Class_path);
		
		Student std= (Student) context.getBean("std"); 
		std.Show();

	}

}
