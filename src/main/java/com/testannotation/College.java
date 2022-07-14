package com.testannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component//(value="colz") //spring container maa basxa 
public class College {
	
	@Autowired
	private Student student;
	
	@Autowired
	private Teacher teacher; //injetion
	
	@Autowired
	@Qualifier(value="englishTeacherServiceImpl")
	private TeacherService tservice;
	
	
	public void printCollege(){
		
		System.out.println(" c name =NCC");
		student.printStudent();
		teacher.printTeacher();
		tservice.teach();
	}
}
