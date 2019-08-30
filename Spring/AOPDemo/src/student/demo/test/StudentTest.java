package student.demo.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import student.demo.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			@SuppressWarnings("deprecation")
			XmlBeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("aop1.xml"));
			
			Student myBean=(Student) beanFactory.getBean("StudentProxy");
			myBean.printName();
			System.out.println("*****");
			myBean.printCourse();

			System.out.println("*****");
			
			try {
				myBean.validate(12);
			}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
	}

}
