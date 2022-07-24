package com.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService forTuneService;
	
	
	@Override
	public String getWorkout() {
		return "1 Hour";
	}

	@Override
	public String getFortune() {
		return forTuneService.getSerice();
	}

}
