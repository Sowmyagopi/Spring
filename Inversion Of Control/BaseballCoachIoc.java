package com.examples.IoC;

public class BaseballCoachIoc implements CoachIoc {
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}
