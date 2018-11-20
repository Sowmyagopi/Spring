package com.examples.AnnotationSetterInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotationSetterInjection implements CoachAnnotationSI{
	
	private FortuneServiceSIAnnotation fortuneService;
	
	// generate setter methods for injection
	
	// configure dependency injection with @Autowired Annotation 
	@Autowired
	public void setFortuneService(FortuneServiceSIAnnotation fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Inside the getDailyWorkout method";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
