package com.dt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Visitor {
	@Value("2000")
	int amt;
	 
	@Autowired
	@Qualifier("euro")
Currency c;
public int getAmt() {
	return amt;
}

public void setAmt(int amt) {
	this.amt = amt;
}
public void my_convert() {
	c.convert(amt);
}
}
