package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface EmpDBDao extends JpaRepositoryImplementation<Employee, Integer> {
	
	public List<Employee> findByDesignation(String designation);	
	@Query("from Employee order by age")
	public List<Employee> getEmployeesSortedByAge();
	@Query("from Employee where designation=?1 order by age")
	public List<Employee> getEmployeesSortedByDesignation(String Designation);

}
