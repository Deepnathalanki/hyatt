package com.example.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Employee;

@Service
public class EmployeeService {

	
	public Employee createEmployee( String name, String id) {
		Employee e=new Employee();
		e.setEmpId(id);
		e.setName(name);
		return e;
	}
	
	public void deletEmployee(@RequestParam String id) {
		System.out.println("Deleting employee"+ id);
	}
}
