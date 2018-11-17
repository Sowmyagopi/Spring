/**
 * 
 */
package com.examples.constrctorInjection;

/**
 * @author user
 * created for implementing the FortuneServiceConstructorInjection interface.
 *
 */
public class HappyFortuneServiceConstructorInjection implements FortuneServiceContructorInjection {

	/* (non-Javadoc)
	 * @see com.examples.constrctorInjection.FortuneServiceContructorInjection#getFortune()
	 */
	@Override
	public String getFortune() {

		return "Today is your lucky day!";
	}

}
