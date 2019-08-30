/**
 * 
 */
package com.sj.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.sj.beans.HelloBean;

/**
 * @author Abridge
 *
 */
public class TestHelloBean {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//BeanFactory factory=new XmlBeanFactory(new ClassPathResource ("hello.xml"));
		
	    BeanFactory factory=new XmlBeanFactory(new ClassPathResource("hello.xml"));  
	      
	    HelloBean student=(HelloBean)factory.getBean("bean1");  
	    student.sayHello();  
		
		
	}

}
