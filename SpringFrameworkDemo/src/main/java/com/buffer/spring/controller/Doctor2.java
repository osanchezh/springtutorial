package com.buffer.spring.controller;

import org.springframework.stereotype.Component;

@Component
public class Doctor2 implements Staff {
	

	public void assist() {
		  System.out.println("Doctor is assisting");
	  }
	}
