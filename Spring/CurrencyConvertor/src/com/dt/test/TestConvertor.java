package com.dt.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.beans.Visitor;

public class TestConvertor {

	public TestConvertor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("indexxx.xml");
		  Visitor obj = (Visitor) context.getBean("visitor");
		  obj.my_convert();
	}

}
