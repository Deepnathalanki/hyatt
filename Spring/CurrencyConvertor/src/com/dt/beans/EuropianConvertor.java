package com.dt.beans;

public class EuropianConvertor implements Currency {
public void convert(int amt) {
	System.out.println("American currency:"+amt*5);
}
}
