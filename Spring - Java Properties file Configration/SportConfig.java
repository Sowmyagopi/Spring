package com.examples.JavaPropValueConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.examples.JavaPropValueConfig")
// configure the porperties file 
@PropertySource("classpath:sport.properties")
public class SportConfig {

	// added component scan, so no configuration for bean
}
