package com.dt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.dt.beans.User;

public class TestCalcy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    BeanFactory factory=new XmlBeanFactory(new ClassPathResource("index.xml"));  
	      
	    User student=(User)factory.getBean("user1");  
	    student.addnum();  
		
	}

}
