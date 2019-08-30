package com.sj.test;

import org.springframework.beans.factory.*;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;
import java.util.Random; 
import com.sj.beans.MailMail;  
public class Test {   
public static void main(String[] args) {  

Random rand = new Random(); 

int rand_int1 = rand.nextInt(1000000); 
//String msg="Your OTP is "+rand_int1;
System.out.println("Random Integers: "+rand_int1); 
  String msg="shaaaaammuuuuuu";    
Resource r=new ClassPathResource("applicationContext.xml");  
BeanFactory b=new XmlBeanFactory(r);  
MailMail m=(MailMail)b.getBean("mailMail");  
String sender="leo.fin.cop@gmail.com";//write here sender gmail id  
String receiver="soumith8187@gmail.com";//write here receiver id  
m.sendMail(sender,receiver,"Forgot Password?",msg);  
      
System.out.println("success"); 

}  
}  