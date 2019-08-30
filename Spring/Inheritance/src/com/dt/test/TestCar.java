package com.dt.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.beans.Car;
import com.dt.beans.Sedan;


public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("indexx.xml");

		 Car obj1 = (Car) context.getBean("c");
		 Sedan obj2 = (Sedan) context.getBean("touristcar");
		 Car obj3 = (Car) context.getBean("anothercar");
		 Car obj4 = (Car) context.getBean("newcar");
		    
	System.out.println("Color: "+obj1.getColor()+" Model: "+obj1.getMake());
	System.out.println("Color: "+obj2.getColor()+" Model: "+obj2.getMake());
	System.out.println("Color: "+obj3.getColor()+" Model: "+obj3.getMake());
	System.out.println("Color: "+obj4.getColor()+" Model: "+obj4.getMake());
		
	}

}
