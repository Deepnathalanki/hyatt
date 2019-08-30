package com.dt.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExampleLifeCycle implements InitializingBean, DisposableBean{
public void afterPropertiesSet() {
   System.out.println("Properties method");
}
void init1() {
System.out.println("My init1 method");
}
public ExampleLifeCycle() {
// TODO Auto-generated constructor stub
}
public void destroy() {
System.out.println("My destroy method");
}
public void destroy1() {
System.out.println("My destroy1 method");
}
public void getMessage()
{
System.out.println("message");
}
}