package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] randomFortune = {
			"Happy Birth Day",
			"Yeah Good",
			"Best of Luck"
	};
	
	Random myRandom = new Random();

	@Override
	public String getFortune() {
		
		return randomFortune[myRandom.nextInt(randomFortune.length)];
	}

}
