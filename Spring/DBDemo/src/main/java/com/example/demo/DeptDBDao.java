package com.example.demo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

public interface DeptDBDao extends JpaRepositoryImplementation<Department, Integer>{

	public Department findByManager(String manager);
}
