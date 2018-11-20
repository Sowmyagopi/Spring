package com.examples.AnnotationMethodInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMethodInjectionDemo {

	public static void main(String[] args) {

		// read the config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("annotationMethodInjection-applicationContext.xml");
		
		// get beans from the config file 
		CoachAnnotationMI theCoach = context.getBean("annotaionMethodInjection", CoachAnnotationMI.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
