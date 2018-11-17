package com.examples.BeanScopesPrototype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppBeanScopesPrototype {

public static void main(String[] args) {
		
	// load the spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("BeanScopesPrototype-applicationContext.xml");
		
	//retrieve beans from spring container
		
		 CoachBeanSopesPrototype theCoach = context.getBean("myCoach",CoachBeanSopesPrototype.class);
		 
		 CoachBeanSopesPrototype alphaCoach = context.getBean("myCoach",CoachBeanSopesPrototype.class);
		 
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
