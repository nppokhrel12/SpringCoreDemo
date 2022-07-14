package com.di;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private String company;
	public Employee(int id, String name, int salary, String company) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}
}