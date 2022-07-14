package com.testannotation;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
	public void printTeacher() {
		System.out.println("name= poja sahi");
		System.out.println("subject=math");
	}
}
