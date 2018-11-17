package com.examples.SILiteralValues;

public class BaseballCoachSILiteralValues implements CoachSILiteralValues {
	
	//define a private field for the dependency
	private FortuneServiceSILiteralValues fortuneService;
	
	// setup private fields for emailAddress, team.
	
	private String emailAddress;
	
	private String team;
	
	// create getter and setter methods for the private fields emailAddress, team
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("BaseballCoach : inside setter method --> setEmailAddress");// these messages are given to check the work behind the scenes
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		System.out.println("BaseballCoach : inside setter method --> setTeam");// these messages are given to check the work behind the scenes
		this.team = team;
	}

	/* creating a no-arg constructor since spring will actually call this constructor
	 * when we make a reference to our bean.
	*/ 
	public BaseballCoachSILiteralValues() {
		System.out.println("BaseballCoach : inside the no-arg constructor"); // to check behind the scenes. Spring calls this method and prints the o/p. 
		
	}
	
	// our setter method. This method will be called by the spring when they actually inject the dependency.
	public void setFortuneService(FortuneServiceSILiteralValues fortuneService) {
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
