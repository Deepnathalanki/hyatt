package com.sj.corejava.client;

import java.util.ArrayList;
import java.util.Iterator;

import com.sj.corejava.model.Employee;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee (1,"Ram",5000));
		employees.add(new Employee (2,"Gita",6000));
		employees.add(new Employee (3,"Sita",7000));
		employees.add(new Employee (4,"Sham",8000));
		Employee e1 = new Employee();
		e1.setEid(5);
		e1.setName("ramu");
		e1.setSalary(8000);
		employees.add(e1);
		
//		Iterator i = employees.iterator();
//		while (i.hasNext())
//		{
//			System.out.println(i.next());
//		}

		for (Employee e : employees) {
			//System.out.println(e);
			e.showIdName();
		}
	}

}
