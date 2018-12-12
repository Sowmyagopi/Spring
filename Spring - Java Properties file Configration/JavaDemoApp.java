package com.examples.JavaPropValueConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaDemoApp {

	public static void main(String[] args) {

		// read the java configuration file
		AnnotationConfigApplicationContext context = new
				AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve the beans from config file
		// Using SportCoach (Class) to use the new methods added for retrieving vales from properties file. 
		SportCoach theCoach = context.getBean("sportCoach",SportCoach.class);
		
		// use the bean to get daily workout and fortune 
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		// print the values read from properties file 
		
		System.out.println("The email : "+theCoach.getEmail());
		
		System.out.println("The team : "+ theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
