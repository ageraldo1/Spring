package com.itktechnologies.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;

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

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("At CricketCoach setEmailAddress method");
		this.emailAddress = emailAddress;
	}	

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("At CricketCoach setTeam method");
		this.team = team;
	}


}
