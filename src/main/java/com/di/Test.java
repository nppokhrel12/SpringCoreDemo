package com.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee e=(Employee) context.getBean("emp");
		System.out.println(e);
	
		Doctor d=context.getBean("Doc",Doctor.class);
		System.out.println(d);
	}
}
