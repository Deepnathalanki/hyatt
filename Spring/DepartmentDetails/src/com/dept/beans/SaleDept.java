package com.dept.beans;

public class SaleDept implements Department {
	public String deptName(String name) {
		System.out.println("From sale dept");
		return name;
	}
}
