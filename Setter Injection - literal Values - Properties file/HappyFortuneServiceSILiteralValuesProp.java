/**
 * 
 */
package com.examples.SILiteralValuesProp;

/**
 * @author user
 * created for implementing the FortuneServiceConstructorInjection interface.
 *
 */
public class HappyFortuneServiceSILiteralValuesProp implements FortuneServiceSILiteralValuesProp {

	/* (non-Javadoc)
	 * @see com.examples.constrctorInjection.FortuneServiceContructorInjection#getFortune()
	 */
	@Override
	public String getFortune() {

		return "Today is your lucky day!";
	}

}
