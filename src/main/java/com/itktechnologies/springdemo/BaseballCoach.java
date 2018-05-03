package com.itktechnologies.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyAssigment() {
		return "Run for 30 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
		
	}

}
