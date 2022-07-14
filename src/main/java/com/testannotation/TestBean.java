package com.testannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestBean {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		College clz=context.getBean("college",College.class);
		clz.printCollege();
		
		Student std=context.getBean("student",Student.class);
		std.printStudent();
	}
}