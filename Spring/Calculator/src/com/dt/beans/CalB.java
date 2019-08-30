package com.dt.beans;

import com.dt.beans.Calculator;

public class CalB implements Calculator {

	public int add(int n1,int n2) {
		System.out.println("from calB");
		return n1+n2;
	}
	
}
