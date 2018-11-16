package com.examples.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppIoc {

public static void main(String[] args) {
		
	// creating a spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrive beans from spring container
		
		 CoachIoc theCoach = context.getBean("myCoach",CoachIoc.class);
		
		 // use the bean 
		 System.out.println(theCoach.getDailyWorkout());
	}


}
