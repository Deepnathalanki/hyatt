package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/web")
public class EmployeeController {
	@Autowired
	EmployeeService serv;
	
	@GetMapping(value="/employees")
	public Employee createEmployee(@RequestParam String name, @RequestParam String empId) {
		System.out.println("workiug");
		return serv.createEmployee(name, empId);
	}
	
	
}
