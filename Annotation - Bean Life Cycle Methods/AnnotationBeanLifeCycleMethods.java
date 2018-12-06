package com.examples.AnnotationBeanLifeCycleMethods;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class AnnotationBeanLifeCycleMethods implements CoachAnnotationBeanLifeCycleMethod {

	@Override
	public String getDailyWorkout() {
		return "This is inside the method getDailyWorkout() - AnnotationBeanLifeCycleMethods";
	}
	
	@PostConstruct
	public void doMyStartpstff() {
		System.out.println("This is inside the init method - doMyStartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupstuff() {
		System.out.println("This is inside the destroy method - doMyCleanupstuff");
	}

}
