package com.examples.AnnotationFieldInjection;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceFIAnnotationImpl implements FortuneServiceFIAnnotation{

	@Override
	public String getFortune() {
		return "Today is a Nice Day!!..";
	}

}
