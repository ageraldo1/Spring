package com.itktechnologies.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	public CricketCoach() {
		System.out.println("At CricketCoach constructor");
		this.fortuneService = null;
		
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("At CricketCoach setFortuneService method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyAssigment() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}



}
