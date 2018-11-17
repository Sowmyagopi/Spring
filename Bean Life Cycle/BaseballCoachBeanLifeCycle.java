package com.examples.BeanLifeCycle;

public class BaseballCoachBeanLifeCycle implements CoachBeanLifeCycle {
	
	private FortuneServiceBeanLifeCycle fortuneService;
	
	public BaseballCoachBeanLifeCycle(FortuneServiceBeanLifeCycle theFortuneService) {
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
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("BaseballCoach : inside method doMyStartupStuff");
	}
	
	// add an destroy method
	public void doMyCleanupStuff() {
		System.out.println("BaseballCoach : inside method doMyCleanupStuff");
	}
}
