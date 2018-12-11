package com.examples.JavaBeanConfiguration;

public class JavaBeanFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "This is your Lucky Day!!";
	}

}
