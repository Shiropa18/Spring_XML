package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		// load the spring configuration file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("cricket", Coach.class);
		
		Cricket cricket = context.getBean("cricket", Cricket.class);
		
		System.out.println("Random Number: " + theCoach.getFortune() + "\nDependency: " +cricket.getName());	
	
		
				
		//call method on bean 
		
		//close the beans
		
		context.close();

	}

}
