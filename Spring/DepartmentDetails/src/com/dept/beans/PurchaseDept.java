package com.dept.beans;

public class PurchaseDept implements Department {
public String deptName(String name) {
	System.out.println("From purchase dept");
	return name;
}
}
