package com.testannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class MathTeacherServiceImpl implements TeacherService {

	@Override
	@Primary //load this as priority 
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("teaches maths subjects");	
	}
}