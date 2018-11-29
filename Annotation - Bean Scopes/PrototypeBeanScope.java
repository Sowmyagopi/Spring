package com.examples.AnnotationBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBeanScope implements CoachAnnotationBeanScope {

	@Override
	public String getDailyWorkout() {
		return "This is inside getDailyWorkout method of prototype bean scope";
	}

}
