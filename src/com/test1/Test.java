package com.test1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		emp.setEid(101);
		emp.setEname("Apple1");
		emp.setEaddress("Number 11");
		
		System.out.println("employee -" + emp);
		
		Resource resource = new ClassPathResource("employeebean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e1 = (Employee)factory.getBean("emp1");
		Employee ea = factory.getBean("emp2", Employee.class);
		System.out.println("employee IOC - " + e1);
		System.out.println("employee IOC - " + ea);
		 
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
		Employee e2 = (Employee)context.getBean("emp1");
		Employee eb = context.getBean("emp2", Employee.class);
		System.out.println("employee IOC - " + e2);
		System.out.println("employee IOC - " + eb);
		
	}

}
