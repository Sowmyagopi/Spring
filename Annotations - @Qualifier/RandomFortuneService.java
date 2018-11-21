package com.examples.AnnotationQualifier;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneServiceAnnotationQualifier {

	public RandomFortuneService() {
		System.out.println("Inside the Default Constructor");
	}

	@Override
	public String getFortune() {
		return "Have a nice day";
	}

}
