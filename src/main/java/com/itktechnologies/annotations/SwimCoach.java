package com.itktechnologies.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;
		
	public SwimCoach(FortuneService f) {
		this.fortuneService = f;
	}
	
	@Override
	public String getDailyWorkout() {
		return "SwimCoach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}
	
	public String getTeam() {
		return team;
	}
	

}
