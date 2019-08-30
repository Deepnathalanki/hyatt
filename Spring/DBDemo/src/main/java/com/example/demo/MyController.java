package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	
	@Autowired
	EmpDBDao dao;
	@Autowired
	DeptDBDao deptdao;
	
	@RequestMapping("/")
	public String welcome() {
		return "welcome.jsp";
	}
	
	@RequestMapping("/displayAll")
	@ResponseBody
	public String displayAllDetails() {
		return dao.findAll().toString();
	}
	
	@RequestMapping("/displayEmp")
	@ResponseBody
	public Optional<Employee> displayAllEmp(@RequestParam int eid) {
		return dao.findById(eid);
		}
	
	@RequestMapping("/displayDesignation")
	@ResponseBody
	public List<Employee> displayByDesignatio(@RequestParam String designation) {
		return dao.findByDesignation(designation);
		}
	@RequestMapping("/displayByDesignation")
	@ResponseBody
	public List<Employee> displayByDesignationn( String designation) {
		return dao.getEmployeesSortedByDesignation(designation);
		}
	

	@RequestMapping("/displayByAge")
	@ResponseBody
	public List<Employee> displayByage() {
		return dao.getEmployeesSortedByAge();
	}
	
	@RequestMapping("/insertEmp")
	@ResponseBody
	public String createEmployee(Employee emp) {
		dao.save(emp);
	return "successfully inserted record";
		}
	

	@RequestMapping("/updateEmp")
	@ResponseBody
	public String updateEmployee(Employee emp) {
	int id=emp.getEid();
	if(dao.existsById(id))
	{
		dao.save(emp);
		return "successfully updated record";

	}
	return "sorry Invalid id";
		}
	

	@RequestMapping("/deleteEmp")
	@ResponseBody
	public String deleteEmployee(int eid) {
	
	if(dao.existsById(eid))
	{
		dao.deleteById(eid);
		return "successfully deleted record";

	}
	return "sorry Invalid id";
		}
	

	@RequestMapping("/collect")
	@ResponseBody
	public String demo()
	{
		Employee e=dao.findById(102).orElse(new Employee());
		Department d=deptdao.findByManager("Rajesh");
		return ""+e.getName()+","+e.getAge()+" "+d.getManager() +"";
	}
	
	
}
