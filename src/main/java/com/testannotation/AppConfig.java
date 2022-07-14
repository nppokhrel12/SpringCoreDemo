package com.testannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //container maa bean banxa wa container active hunxa.
@ComponentScan(basePackages = "com.testannotation")//yo bhitra ko class laai spring le  array maa multiple pani linca 
public class AppConfig {
	@Bean(name="college")
	public College getCollegeBean() {
		return new College();
	}
}
