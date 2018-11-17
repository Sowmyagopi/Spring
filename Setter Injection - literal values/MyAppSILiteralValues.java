package com.examples.SILiteralValues;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppSILiteralValues {

public static void main(String[] args) {
		
	// creating a spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("SILiteralValues-applicationContext.xml");
		
		//retrieve beans from spring container
		
		BaseballCoachSILiteralValues theCoach = context.getBean("myCoach",BaseballCoachSILiteralValues.class);
		
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
