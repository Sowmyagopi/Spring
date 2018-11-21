package com.examples.AnnotationFieldInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationFieldInjection {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("annotationFieldInjection-applicationContext.xml");
		
		// get the bean from spring config file
		
		CoachAnnotationFI theCoach = context.getBean("fieldInjectionAnnotation", CoachAnnotationFI.class);
		
		// use the bean to get Daily workout and Fortune
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
