package com.examples.AnnotationDefaultComponent;

import org.springframework.stereotype.Component;

// adding @Component Annotation to java class 

@Component
public class BaseballCoachAnnotationDefaultComponent implements CoachAnnotationDefaultComponent{

	@Override
	public String getDailyWorkout() {
		return "Practice backhand Volley";
	}

}
