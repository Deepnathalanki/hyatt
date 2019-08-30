package student.demo.advice;

import org.springframework.aop.ThrowsAdvice;

public class MyMethodThrowsAdvice implements ThrowsAdvice {

	
	public void afterThrowing(Exception ex){  
        System.out.println(" Throw method - additional concern if exception occurs");  
    }  
}
