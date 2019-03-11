package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {
	
	private FotuneService fotuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public FootballCoach(FotuneService theFotuneService) {
		this.fotuneService = theFotuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hello Football Coach";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fotuneService.getNewFotune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	

}
