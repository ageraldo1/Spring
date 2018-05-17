package com.itktechnologies.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
	
	public static void main(String args[]) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println();
		System.out.println("Daily workout...:"  + swimCoach.getDailyWorkout());
		System.out.println("Daily fortune...:"  + swimCoach.getDailyFortune());
		System.out.println("Email...........:"  + swimCoach.getEmail());
		System.out.println("Team............:"  + swimCoach.getTeam());
		System.out.println();
		
		context.close();
		
	}
}
