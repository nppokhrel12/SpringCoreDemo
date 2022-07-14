package com.testannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {

	@Value("kishor")
	private String name;
	@Value("500")
	private int rollno;
	
	public void printStudent(){
		System.out.println("name= "+name);
		System.out.println("rollno= "+rollno);
	}
	
}
