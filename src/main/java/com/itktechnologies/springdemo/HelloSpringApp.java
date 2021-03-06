package com.itktechnologies.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		System.out.println ( theCoach.getDailyAssigment());
		
		// injection
		System.out.println (theCoach.getDailyFortune());
		
		// Cricket
		CricketCoach c = context.getBean("myCricketCoach", CricketCoach.class); 
		System.out.println(c.getDailyAssigment());
		System.out.println(c.getDailyFortune());
		System.out.println(c.getEmailAddress());
		System.out.println(c.getTeam());
 
		
		// close the context
		context.close();
		
		

	}

}
