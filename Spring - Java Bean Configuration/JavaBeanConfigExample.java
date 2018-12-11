package com.examples.JavaBeanConfiguration;

public class JavaBeanConfigExample implements Coach {
	
	private FortuneService fortuneService;
	
	public JavaBeanConfigExample(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is inside the method getDailyWorkout - JavaBeanConfigExample class";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
