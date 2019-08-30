package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
/*
	for h2-console
			spring.h2.console.enabled=true
			spring.datasource.platform=h2
			spring.datasource.url=jdbc:h2:mem:test
	for mariadb
			spring.datasource.driver-class-name= org.mariadb.jdbc.Driver
			spring.datasource.url=jdbc:mariadb://localhost:3306/bank
			spring.datasource.username= root
			spring.datasource.password= root


*/
	@Id
	private int eid;
	private String name;
	private int age;
	private String designation;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", age=" + age + ", designation=" + designation + "]";
	}
	
}
