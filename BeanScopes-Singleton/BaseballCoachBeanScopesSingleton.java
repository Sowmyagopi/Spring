package com.examples.BeanScopesSingleton;

public class BaseballCoachBeanScopesSingleton implements CoachBeanSopesSingleton {
	
	private FortuneServiceBeanScopesSingleton fortuneService;
	
	public BaseballCoachBeanScopesSingleton(FortuneServiceBeanScopesSingleton theFortuneService) {
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
