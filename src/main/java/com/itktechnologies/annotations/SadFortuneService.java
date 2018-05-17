package com.itktechnologies.annotations;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your SAD day";
	}

}
