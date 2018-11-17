/**
 * 
 */
package com.examples.BeanLifeCycle;

/**
 * @author user
 * created for implementing the FortuneServiceConstructorInjection interface.
 *
 */
public class HappyFortuneServiceBeanLifeCycle implements FortuneServiceBeanLifeCycle {

	/* (non-Javadoc)
	 * @see com.examples.constrctorInjection.FortuneServiceContructorInjection#getFortune()
	 */
	@Override
	public String getFortune() {

		return "Today is your lucky day!";
	}

}
