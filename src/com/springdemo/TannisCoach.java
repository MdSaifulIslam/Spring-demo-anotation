package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TannisCoach implements Coach {
	
	Fortune fortuneService;

	@Autowired
	public TannisCoach(Fortune fortuneService) {
		this.fortuneService = fortuneService;
	}

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

}
