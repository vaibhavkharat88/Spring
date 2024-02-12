package com.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String File_path="/com/resources/ApplicationContext.xml";
		ApplicationContext context= new ClassPathXmlApplicationContext(File_path);
		
		Student std= (Student) context.getBean("stdId");
		std.Show();

	}

}
