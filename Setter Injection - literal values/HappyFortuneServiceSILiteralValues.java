/**
 * 
 */
package com.examples.SILiteralValues;

/**
 * @author user
 * created for implementing the FortuneServiceConstructorInjection interface.
 *
 */
public class HappyFortuneServiceSILiteralValues implements FortuneServiceSILiteralValues {

	/* (non-Javadoc)
	 * @see com.examples.constrctorInjection.FortuneServiceContructorInjection#getFortune()
	 */
	@Override
	public String getFortune() {

		return "Today is your lucky day!";
	}

}
