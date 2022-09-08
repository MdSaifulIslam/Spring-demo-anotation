package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TannisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;

	// @Autowired
	// public TannisCoach(FortuneService fortuneService) {
	// this.fortuneService = fortuneService;
	// }

	public TannisCoach() {
	}
	
	@PostConstruct
	public void doAfterCreate() {
		System.out.println("Created first");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}

//	@Autowired
//	public void setservice(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backhand volly";
	}

	@Override
	public String getDailyForyune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@PreDestroy
	public void doBeforeDestroy() {
		System.out.println("Good Bye, I have done");
	}
}
