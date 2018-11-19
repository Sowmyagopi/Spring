package com.examples.Annotation;

import org.springframework.stereotype.Component;

// adding @Component Annotation to java class

@Component("myCoach")
public class BaseballCoachAnnotation implements CoachAnnotation{

	@Override
	public String getDailyWorkout() {
		return "Practice backhand Volley";
	}

}
