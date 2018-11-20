package com.examples.AnnotationMethodInjection;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceMIAnnotationImpl implements FortuneServiceMIAnnotation{

	@Override
	public String getFortune() {
		return "Today is yor lucky day";
	}

}
