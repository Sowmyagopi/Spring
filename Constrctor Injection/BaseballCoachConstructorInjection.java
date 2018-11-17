package com.examples.constrctorInjection;

public class BaseballCoachConstructorInjection implements CoachConstructorInjection {
	
	//define a private field for the dependency
	private FortuneServiceContructorInjection fortuneService;
	
	// define a constructor for dependency injection
	public BaseballCoachConstructorInjection(FortuneServiceContructorInjection theFortuneService) {
		this.fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune.
		return fortuneService.getFortune();
	}

}
