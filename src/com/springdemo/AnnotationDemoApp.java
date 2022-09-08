package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach tannisCoach = context.getBean("theTannisCoach", Coach.class);
		
		System.out.println(tannisCoach.getDailyWorkout());
		
		context.close();

	}

}
