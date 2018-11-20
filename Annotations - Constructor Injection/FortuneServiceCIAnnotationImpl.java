package com.examples.AnnotationConstructorInjection;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceCIAnnotationImpl implements FortuneServiceCIAnnotation{

	@Override
	public String getFortune() {
		return "Today is yor lucky day!";
	}

}
