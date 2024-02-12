package com.vaibhav.Annotaion_based;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {

    ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
    Employee emp1= (Employee) context.getBean("iii");
    emp1.show();
    System.out.println( emp1 ); 
     
}
}
