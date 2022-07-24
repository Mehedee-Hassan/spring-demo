package com.text.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import javax.annotation.*;

@Component
public class CricketCoach implements Coach {

	
	@Autowired
	@Qualifier("happyFortuneService")
	FortuneService fortuneService;
	
//	
//	@Autowired
//	public CricketCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@Override
	public String getWorkout() {
		return "Cricket bowling 10";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("test");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("end");
	}

}
