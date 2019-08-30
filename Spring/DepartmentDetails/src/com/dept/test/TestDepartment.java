package com.dept.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dept.beans.Emp;

public class TestDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("details.xml"));  
	      
	    Emp student=(Emp)factory.getBean("emp");  
	    student.dept();  
		
		
		
	}

}
