package com.itktechnologies.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itktechnologies.annotations.Coach;

public class AnnotationDemoApp {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanAnnotations-applicationContext.xml");
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println();
		System.out.println("Daily workout...:"  + tennisCoach.getDailyWorkout());
		System.out.println("Daily fortune...:"  + tennisCoach.getDailyFortune());
		System.out.println();
		
		context.close();
		
	}
}
