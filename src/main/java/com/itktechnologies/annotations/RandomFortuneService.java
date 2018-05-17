package com.itktechnologies.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	

	@Override
	public String getFortune() {
		String[] fortune = {
				"Random 1",
				"Random 2",
				"Random 3"
			};
		
		Random rand = new Random();
		
		return "Today is your "  + fortune[rand.nextInt(fortune.length)] + " day";
	}

}
