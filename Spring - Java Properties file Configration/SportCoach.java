package com.examples.JavaPropValueConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SportCoach implements Coach {
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	@Autowired
	private FortuneService fortuneService;
	

	@Override
	public String getDailyWorkout() {
		return "Practice for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	// generate methods to get the values from properties file
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}


}
