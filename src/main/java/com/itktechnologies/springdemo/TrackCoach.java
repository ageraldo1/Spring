package com.itktechnologies.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
		
	

	@Override
	public String getDailyAssigment() {
		return "Run for 4 hours without stop";
		
	}

	@Override
	public String getDailyFortune() {
		return "Just do it:" + fortuneService.getFortune();
	}
	
	// at startup method
	public void init() {
		System.out.println("TrackCoach: At init method...");
	}
	
	// destroy method
	public void destroy() {
		System.out.println("TrackCoach: At destroy method...");
	}

}
