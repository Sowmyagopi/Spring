package com.examples.AnnotationQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnnotationQualifierDI implements CoachQualifierAnnotation {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneServiceAnnotationQualifier fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Inside the method getDailyWorkout of the class AnnotationQalifierDI";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
