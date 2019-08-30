package com.dt.beans;

public class AmericanConvertor implements Currency {
	public void convert(int amt) {
		System.out.println("Europian currency:" +amt*10);
	}
}
