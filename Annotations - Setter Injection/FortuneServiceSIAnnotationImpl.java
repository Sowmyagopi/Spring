package com.examples.AnnotationSetterInjection;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceSIAnnotationImpl implements FortuneServiceSIAnnotation {

	@Override
	public String getFortune() {
		return "Today is your lucky Day!!";
	}

}
