package com.examples.JavaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main (String args[]) {
		
		// read spring java configuration class
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(JavaConfig.class);
		
		// retrieve the bean 
		JavaCoach theCoach = context.getBean("javaConfigExample",JavaCoach.class);
		
		// use the bean to get daily workout and fortune
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
		
	}

}
