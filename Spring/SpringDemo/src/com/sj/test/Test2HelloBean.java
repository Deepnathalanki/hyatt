package com.sj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.sj.beans.HelloConstr;

public class Test2HelloBean {
	public static void main(String[]args) {

	  BeanFactory factory=new XmlBeanFactory(new ClassPathResource("hello.xml"));  
	  HelloConstr bean=(HelloConstr) factory.getBean("bean2");
	  bean.sayHi();
}
 
}