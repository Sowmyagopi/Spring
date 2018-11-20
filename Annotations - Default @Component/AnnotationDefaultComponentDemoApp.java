package com.examples.AnnotationDefaultComponent;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDefaultComponentDemoApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("annotationDefaultComponent-applicationContext.xml");
		
		CoachAnnotationDefaultComponent theCoach = context.getBean("baseballCoachAnnotationDefaultComponent",
				CoachAnnotationDefaultComponent.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
