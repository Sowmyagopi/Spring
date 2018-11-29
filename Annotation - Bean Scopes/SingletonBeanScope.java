package com.examples.AnnotationBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton") // by default the bean scope is singleton. its not need to explicitly mention it
public class SingletonBeanScope implements CoachAnnotationBeanScope {

	@Override
	public String getDailyWorkout() {
		return "Inside the method getDailyWorkout of SingletonBeanScope";
	}

}
