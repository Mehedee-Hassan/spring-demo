package com.javaconfig;

import org.springframework.stereotype.Component;

@Component
public interface Coach {
	public String getWorkout();
	public String getFortune();
}
