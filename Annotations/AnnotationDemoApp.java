package com.examples.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("annotation-applicationContext.xml");
		
		CoachAnnotation theCoach = context.getBean("myCoach",CoachAnnotation.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
