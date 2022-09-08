package com.springdemo;

import org.springframework.stereotype.Component;

@Component("theTannisCoach")
public class TannisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice backhand volly";
	}

}
