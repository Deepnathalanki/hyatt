package com.sj.beans;

public class HelloConstr {
String msg1;

public HelloConstr() {
	super();
	// TODO Auto-generated constructor stub
}

public HelloConstr(String msg1) {
	super();
	this.msg1 = msg1;
}
public void sayHi() {
	System.out.println("Hi from Spring team"+msg1);
}
}
