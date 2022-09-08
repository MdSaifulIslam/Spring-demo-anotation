package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaAnnotationDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SprotsConfig.class);
		
		SwinCoach mySwimCoach = context.getBean("swimCoach", SwinCoach.class);
		
		System.out.println(mySwimCoach.getDailyWorkout());
		
		System.out.println(mySwimCoach.getDailyForyune());
		
		System.out.println("Email: " + mySwimCoach.getEmail() 
			+ " and Team: " + mySwimCoach.getTeam());
		
		context.close();

	}

}
