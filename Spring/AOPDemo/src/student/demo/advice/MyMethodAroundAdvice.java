 package student.demo.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Object obj;
		 System.out.println("Around method before actual logic");  
	        obj=mi.proceed();  
	        System.out.println("Around method after actual logic");  
		
		return null;
	}

}
