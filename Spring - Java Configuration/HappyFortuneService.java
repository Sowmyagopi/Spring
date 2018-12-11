package com.examples.JavaConfiguration;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements JavaFortuneService {

	@Override
	public String getFortune() {
		return "This is your Lucky Day!!";
	}

}
