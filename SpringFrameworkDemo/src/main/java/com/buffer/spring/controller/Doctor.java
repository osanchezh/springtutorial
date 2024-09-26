package com.buffer.spring.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.BeanNameAware;

public class Doctor implements Staff, BeanNameAware {
	
  private String qualification;
  private Nurse nurse;
  public Nurse getNurse() {
	return nurse;
}

public void setNurse(Nurse nurse) {
	this.nurse = nurse;
}

public String getQualification() {
	return qualification;
}

public void setQualification(String qualification) {
	this.qualification = qualification;
}

public void assist() {
	  System.out.println("Doctor is assisting");
  }

@Override
public void setBeanName(String name) {
	System.out.println("Set bean name method is called");
	
}
@PostConstruct
public void postConstruct() {
	System.out.println("Set postConstruct is called");
}
}
