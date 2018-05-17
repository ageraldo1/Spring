package com.itktechnologies.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itktechnologies.annotations.Coach;

public class JavaConfigDemoApp {
	
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println();
		System.out.println("Daily workout...:"  + tennisCoach.getDailyWorkout());
		System.out.println("Daily fortune...:"  + tennisCoach.getDailyFortune());
		System.out.println();
		
		context.close();
		
	}
}
