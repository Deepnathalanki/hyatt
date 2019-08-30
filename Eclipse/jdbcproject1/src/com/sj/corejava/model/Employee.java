package com.sj.corejava.model;

public class Employee {

	int eid;
	String name;
	double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name + ", salary=" + salary ;
	}
	public void showIdName () {
		System.out.println("ID:"+eid+" name:"+name);
	
	}
	
}
