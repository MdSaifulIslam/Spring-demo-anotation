package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach = context.getBean("tannisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tannisCoach", Coach.class);
		
		System.out.println("AnnotationBeanScopeDemoApp.main() same? : " + (myCoach == alphaCoach));
		
		context.close();

	}

}
