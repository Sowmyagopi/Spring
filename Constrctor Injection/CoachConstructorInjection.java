/**
 * 
 */
package com.examples.constrctorInjection;

/**
 * This is interface is created so that it will support all type of coach.
 * Each coach will call the getDailyWorkout() method to get the daily work out practice.
 *
 */
public interface CoachConstructorInjection {
	
	public String getDailyWorkout();
	
	public String getDailyFortune();
}
