package com.dt.beans;

import com.dt.beans.Calculator;

public class CalA implements Calculator {
	public int add(int n1,int n2) {
		System.out.println("from calA");
		return n1+n2;
	}
}
