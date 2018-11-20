package com.examples.AnnotationConstructorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoAnnotaionCI {
	
	public static void main(String args[]) {
		
		// read the spring config file
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("annotationConstructorInjection-applicationContext.xml");
		
		// retrieve bean from the config file
		CoachAnnotationCI theCoach = context.getBean("tennisCoach", CoachAnnotationCI.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get the daily fortne
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
