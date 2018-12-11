package com.examples.JavaBeanConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBeanConfigDemoApp {

	public static void main(String[] args) {

		// read the spring configration class
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SpringConfig.class);
		
		// Retrieve the bean from the spring container
		Coach theCoach = context.getBean("springCoach",Coach.class);
		
		// use the bean to get Daily fortune and workout
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
