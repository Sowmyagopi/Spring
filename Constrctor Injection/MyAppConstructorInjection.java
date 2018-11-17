package com.examples.constrctorInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppConstructorInjection {

public static void main(String[] args) {
		
	// creating a spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("ConstructorInjection-applicationContext.xml");
		
		//retrieve beans from spring container
		
		 CoachConstructorInjection theCoach = context.getBean("myCoach",CoachConstructorInjection.class);
		
		 // use the bean 
		 System.out.println(theCoach.getDailyWorkout());
		 
		 // call the new method for fortunes
		 System.out.println(theCoach.getDailyFortune());
		 
		 //close the context
		 context.close();
	}


}
