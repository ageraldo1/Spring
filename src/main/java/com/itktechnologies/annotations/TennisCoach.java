package com.itktechnologies.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")     // default bean id if there is no annotation
	private FortuneService fortuneService;
	
	public TennisCoach() {
		this.fortuneService = null;
	}
	
/*	@Autowired
	public TennisCoach(FortuneService f ) {
		this.fortuneService = f;
	}
*/	
	@Override
	public String getDailyWorkout() {
		return "TennnisCoach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	/*
	@Autowired
	public void setFortuneService(FortuneService f) {
		this.fortuneService = f;
	}
	*/
	
	@PostConstruct
	private void init() {
		System.out.println("At init method for TennisCoach class");
	}
	
	@PreDestroy
	private void destroy() {
		System.out.println("At destroy method for TennisCoach class");
	}

}
