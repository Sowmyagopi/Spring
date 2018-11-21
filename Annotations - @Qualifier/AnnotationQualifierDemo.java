package com.examples.AnnotationQualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationQualifierDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("annotationQualifier-applicationContext.xml");
		
		// get bean from the container
		CoachQualifierAnnotation theCoach = context.getBean("annotationQualifierDI", CoachQualifierAnnotation.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
