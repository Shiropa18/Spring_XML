package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public FotuneService helloFortuneSevice() {
		return new HelloFortuneservice();				
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(helloFortuneSevice());
	}
	

}
