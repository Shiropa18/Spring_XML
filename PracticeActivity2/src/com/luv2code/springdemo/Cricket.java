package com.luv2code.springdemo;

public class Cricket implements Coach {
	
	private FortuneService fortuneService;
	
	private String name;
	
	
	
	public Cricket(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	public String getName() {
		return name;
	}



	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getOneFortune();
	}
	
	
	public void start() {
		System.out.println("Cricket init method");
	}
	
	public void destroy() {
		System.out.println("Cricket destroy method");
	}
	

}
