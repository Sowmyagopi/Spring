package com.examples.JavaConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.examples.JavaConfiguration")
public class JavaConfig {
	// using component scanning for instead of defining bean manually.
}
