package com.text.autoconfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("cricketCoach",Coach.class);
		
		
		System.out.println(theCoach.getWorkout());
		System.out.println(theCoach.getFortune());
		
		context.close();
	}
}
