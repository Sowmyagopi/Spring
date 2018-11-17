package com.examples.BeanScopesPrototype;

public class BaseballCoachBeanScopesPrototype implements CoachBeanSopesPrototype {
	
	private FortuneServiceBeanScopesPrototype fortuneService;
	
	public BaseballCoachBeanScopesPrototype(FortuneServiceBeanScopesPrototype theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
