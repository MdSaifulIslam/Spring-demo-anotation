package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwinCoach implements Coach {
	
	private FortuneService mySwimFortune;
	
	@Value("${email}")
	private String email;
	
	@Value("${team}")
	private String team;

	public SwinCoach(FortuneService mySwimFortune) {
		this.mySwimFortune = mySwimFortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 100 meters daily";
	}

	@Override
	public String getDailyForyune() {
		// TODO Auto-generated method stub
		return mySwimFortune.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
