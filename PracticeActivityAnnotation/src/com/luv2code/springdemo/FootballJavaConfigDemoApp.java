package com.luv2code.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballJavaConfigDemoApp {

	public static void main(String[] args) {
		// load the spring configuration file
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		//retrieve bean from spring container
		
		Coach theCoach = context.getBean("footballCoach", Coach.class);
		
		FootballCoach theFootballCoach = context.getBean("footballCoach", FootballCoach.class);
		
		System.out.println(theCoach.getDailyWorkout());		
		
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Email: " + theFootballCoach.getEmail());
		
		System.out.println("Team: " + theFootballCoach.getTeam());
		//close the beans
		
		context.close();

	}

}
