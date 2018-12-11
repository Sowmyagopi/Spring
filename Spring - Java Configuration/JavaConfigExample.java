package com.examples.JavaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class JavaConfigExample implements JavaCoach {
	
	// dependency injection with @Autowired annotation
	@Autowired
	@Qualifier("happyFortuneService")
	private JavaFortuneService fortneService;

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortneService.getFortune();
	}

}
