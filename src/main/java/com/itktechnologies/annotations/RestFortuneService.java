package com.itktechnologies.annotations;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your REST day";
	}

}
