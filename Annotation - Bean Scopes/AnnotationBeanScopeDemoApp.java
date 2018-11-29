package com.examples.AnnotationBeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load the spring config file
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("annotationBeanScope-applicationContext.xml");
		
		// commented for prototype bean scope example
		/*
		// Retrieve the bean from the config file
		CoachAnnotationBeanScope theCoach = context.getBean("singletonBeanScope", CoachAnnotationBeanScope.class);
		
		CoachAnnotationBeanScope appCoach = context.getBean("singletonBeanScope", CoachAnnotationBeanScope.class);
		*/
		
		CoachAnnotationBeanScope theCoach = context.getBean("prototypeBeanScope", CoachAnnotationBeanScope.class);
		
		CoachAnnotationBeanScope appCoach = context.getBean("prototypeBeanScope", CoachAnnotationBeanScope.class);
		
		boolean result = (theCoach == appCoach);
		
		
		// print the result to verify the memory location
		System.out.println("\n Pointing to the same object :" + result);
		
		System.out.println("\n Memory location of theCoach :" + theCoach);
		
		System.out.println("\nMemory location of appCoach :" + appCoach);
		
		context.close();
		
		
	}

}
