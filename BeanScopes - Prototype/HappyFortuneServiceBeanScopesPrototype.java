/**
 * 
 */
package com.examples.BeanScopesPrototype;

/**
 * @author user
 * created for implementing the FortuneServiceConstructorInjection interface.
 *
 */
public class HappyFortuneServiceBeanScopesPrototype implements FortuneServiceBeanScopesPrototype {

	/* (non-Javadoc)
	 * @see com.examples.constrctorInjection.FortuneServiceContructorInjection#getFortune()
	 */
	@Override
	public String getFortune() {

		return "Today is your lucky day!";
	}

}
