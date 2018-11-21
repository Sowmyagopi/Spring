package com.examples.AnnotationFieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionAnnotation implements CoachAnnotationFI {
	
	// Dependency injection is directly applied to a field with @Autowired Annotation.
	@Autowired
	private FortuneServiceFIAnnotation fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Inside method getDailyWorkout of FieldInjectionClass";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
