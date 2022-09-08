package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements Fortune {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Good Luck";
	}

}
