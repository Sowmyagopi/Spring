package com.examples.AnnotationSetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSIDemo {

	public static void main(String[] args) {
		
		// read the config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("annotationSetterInjection-applicationContext.xml");
		
		// get beans from the config file 
		CoachAnnotationSI theCoach = context.getBean("annotationSetterInjection", CoachAnnotationSI.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// get the daily fortune 
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
