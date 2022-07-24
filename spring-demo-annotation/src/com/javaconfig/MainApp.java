package com.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
		
		Coach theCoach = context.getBean("cricketCoach",Coach.class);
		
		System.out.println(theCoach.getWorkout());
		System.out.println(theCoach.getFortune());
		context.close();
	}
}
