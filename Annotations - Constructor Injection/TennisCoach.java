package com.examples.AnnotationConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//using default bean

@Component
public class TennisCoach implements CoachAnnotationCI {
	
	private FortuneServiceCIAnnotation fortuneService;
	
	// create constructor for dependency injection
	
	// configure the dependency using the @Autowired annotation
	
	@Autowired
	public TennisCoach(FortuneServiceCIAnnotation theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
