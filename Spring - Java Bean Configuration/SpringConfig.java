package com.examples.JavaBeanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	// manually configuring the beans
	@Bean
	public FortuneService happyFortuneService() {
		return new JavaBeanFortuneService();
	}

	@Bean
	public Coach springCoach(FortuneService fortuneService) {
		JavaBeanConfigExample javaBean = new JavaBeanConfigExample(happyFortuneService());
		return javaBean;
	}
}
