package com.examples.AnnotationQualifier;

import org.springframework.stereotype.Component;

@Component
public class FortuneServiceAnnotationQualifierImpl implements FortuneServiceAnnotationQualifier{

	@Override
	public String getFortune() {
		return "Today is your lucky Day";
	}

}
