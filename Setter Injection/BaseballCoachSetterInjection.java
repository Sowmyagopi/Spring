package com.examples.setterInjection;

public class BaseballCoachSetterInjection implements CoachSetterInjection {
	
	//define a private field for the dependency
	private FortuneServiceSetterInjection fortuneService;
	
	/* creating a no-arg constructor since spring will actually call this constructor
	 * when we make a reference to our bean.
	*/ 
	public BaseballCoachSetterInjection() {
		System.out.println("BaseballCoach : inside the no-arg constructor"); // to check behind the scenes. Spring calls this method and prints the o/p. 
		
	}
	
	// our setter method. This method will be called by the spring when they actually inject the dependency.
	public void setFortuneService(FortuneServiceSetterInjection fortuneService) {
		this.fortuneService = fortuneService;
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
