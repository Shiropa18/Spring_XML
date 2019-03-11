package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
	
	private FotuneService fortuneService;
	
	@Autowired
	public CricketCoach(FotuneService theFortuneservice) {
		this.fortuneService = theFortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket is a nice game";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFotune();
	}
	
	

}
