package com.examples.AnnotationMethodInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnnotaionMethodInjection implements CoachAnnotationMI {

	private FortuneServiceMIAnnotation fortuneService;
	
	//inject dependency in any method by adding @Autowired annotation to the method 
	@Autowired
	public void methodInjection(FortuneServiceMIAnnotation fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Inside the getDailyWorkout of AnnotaionMethodInjection class";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
