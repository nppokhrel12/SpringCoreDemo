package com.testannotation;

import org.springframework.stereotype.Component;

@Component
public class EnglishTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		
		// TODO Auto-generated method stub
		System.out.println("teaching english subject");
	}
}