package com.itktechnologies.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		System.out.println("\nSame Object.....................: " + (theCoach == alphaCoach));
		System.out.println("\nMemory addresss for theCoach....: " + theCoach);
		System.out.println("\nMemory addresss for alphaCoach..: " + alphaCoach + "\n");
		
		context.close();

	}

}
