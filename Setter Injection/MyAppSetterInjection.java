package com.examples.setterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppSetterInjection {

public static void main(String[] args) {
		
	// creating a spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("SetterInjection-applicationContext.xml");
		
		//retrieve beans from spring container
		
		 CoachSetterInjection theCoach = context.getBean("myCoach",CoachSetterInjection.class);
		
		 // use the bean 
		 System.out.println(theCoach.getDailyWorkout());
		 
		 // call the new method for fortunes
		 System.out.println(theCoach.getDailyFortune());
		 
		 //close the context
		 context.close();
	}


}
