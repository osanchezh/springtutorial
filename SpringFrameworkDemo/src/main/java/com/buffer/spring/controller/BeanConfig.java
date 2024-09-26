package com.buffer.spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.buffer.spring.controller")
public class BeanConfig {

	@Bean
	@Scope(scopeName="singleton")
	public Doctor doctor() {
		Doctor d=new Doctor();
		d.setNurse(nurse());
		d.setQualification("db");
		return d;
	}
	@Bean
	public Nurse nurse() {
		return new Nurse();
	}
}
