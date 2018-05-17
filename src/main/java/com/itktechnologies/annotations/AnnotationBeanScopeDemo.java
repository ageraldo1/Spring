package com.itktechnologies.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotations-applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println();
		System.out.println("Are the objects the same......: " + (theCoach == alphaCoach));
		System.out.println("theCoach memory address.......: " + theCoach);
		System.out.println("alphaCoach memory address.....: " + alphaCoach);
		System.out.println();
		
		context.close();
		

	}

}
