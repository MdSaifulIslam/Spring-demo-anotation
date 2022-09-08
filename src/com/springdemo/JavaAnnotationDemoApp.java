package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaAnnotationDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SprotsConfig.class);
		
		Coach tannisCoach = context.getBean("tannisCoach", Coach.class);
		
		System.out.println(tannisCoach.getDailyWorkout());
		
		System.out.println(tannisCoach.getDailyForyune());
		
		context.close();

	}

}
