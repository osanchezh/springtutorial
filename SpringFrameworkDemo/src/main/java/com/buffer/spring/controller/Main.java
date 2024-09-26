package com.buffer.spring.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	 //ApplicationContext context= 
	//		 new ClassPathXmlApplicationContext("spring1.xml");
     ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
	 Doctor doctor = context.getBean(Doctor.class);
     doctor.assist();
     
     System.out.println("--"+doctor.getQualification());
     Nurse nurse = context.getBean(Nurse.class);
     nurse.assist();
     
     Staff doctor1 = context.getBean(Doctor.class);
     doctor1.assist();
     Staff nurse1 = context.getBean(Nurse.class);
     nurse1.assist();
     
     Staff doctor2 = context.getBean(Doctor2.class);
     doctor2.assist();
	}

}
