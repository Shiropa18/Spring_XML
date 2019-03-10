package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	String[] fortune = {"A", "B", "C"}; 
	
	@Override
	public String getOneFortune() {
		// TODO Auto-generated method stub
		
		Random rand = new Random(); 
		 
        int a = rand.nextInt(fortune.length);
		
		String b = fortune[a];
		
		return b;
	}
	
	public void start() {
		System.out.println("Happy Fortune init method");
	}
	
	public void destroy() {
		System.out.println("Happy Fortune destroy method");
	}

}
