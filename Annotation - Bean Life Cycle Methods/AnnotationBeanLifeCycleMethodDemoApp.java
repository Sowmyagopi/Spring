package com.examples.AnnotationBeanLifeCycleMethods;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanLifeCycleMethodDemoApp {

	public static void main(String[] args) {
		
		// confiure the file 
		ClassPathXmlApplicationContext context = new
				ClassPathXmlApplicationContext("annotationBeanLifeCycleMethods-applicationContext.xml");
		
		// retrive the bean from the file
		CoachAnnotationBeanLifeCycleMethod theCoach = context.getBean("annotationBeanLifeCycleMethods",
				CoachAnnotationBeanLifeCycleMethod.class);
		
		// use the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}

}
