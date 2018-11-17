package com.examples.BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * have used XML as spring container
 */ 

public class MyAppBeanLifeCycle {

public static void main(String[] args) {
		
	// load the spring container
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
	//retrieve beans from spring container
		
		 CoachBeanLifeCycle theCoach = context.getBean("myCoach",CoachBeanLifeCycle.class);
		 
	// use the bean
		 System.out.println(theCoach.getDailyFortune());
		 
		 System.out.println(theCoach.getDailyWorkout());
		 
		 //close the context
		 context.close();
	}
} 
