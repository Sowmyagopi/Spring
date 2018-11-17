package com.examples.SILiteralValuesProp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppSILiteralValuesProp {

public static void main(String[] args) {
		
	// creating a spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("SILiteralValuesProp-applicationContext.xml");
		
		//retrieve beans from spring container
		
		BaseballCoachSILiteralValuesProp theCoach = context.getBean("myCoach",BaseballCoachSILiteralValuesProp.class);
		
		 // use the bean 
		 System.out.println(theCoach.getDailyWorkout());
		 
		 // call the new method for fortunes
		 System.out.println(theCoach.getDailyFortune());
		 
		 //call our new methods to get the literal values
		 
		 System.out.println(theCoach.getEmailAddress());
		 
		 System.out.println(theCoach.getTeam());
		 
		 //close the context
		 context.close();
	}


}
