package com.examples.BeanScopesSingleton;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppBeanScopesSingleton {

public static void main(String[] args) {
		
	// load the spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("BeanScopesSingleton-applicationContext.xml");
		
	//retrieve beans from spring container
		
		 CoachBeanSopesSingleton theCoach = context.getBean("myCoach",CoachBeanSopesSingleton.class);
		 
		 CoachBeanSopesSingleton alphaCoach = context.getBean("myCoach",CoachBeanSopesSingleton.class);
		 
		 // check if the beans are same
		 
		 boolean result = (theCoach == alphaCoach);
		 
		 System.out.println("Pointing to the same object: "+ result);
		 
		 // to get the memory location for the beans
		 
		 System.out.println("Memory Location for theCoach : " + theCoach);

		 System.out.println("Memory Location for alphaCoach : " + alphaCoach);
		 
		 //close the context
		 context.close();
	}
} 
