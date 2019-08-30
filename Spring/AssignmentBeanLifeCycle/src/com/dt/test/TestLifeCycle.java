package com.dt.test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dt.beans.ExampleLifeCycle;
public class TestLifeCycle {

public TestLifeCycle() {
// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");

 ExampleLifeCycle obj = (ExampleLifeCycle) context.getBean("example");
     obj.getMessage();
     context.registerShutdownHook();

}

}