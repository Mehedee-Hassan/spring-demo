package com.text.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class UnHappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "GET FORTUNE UNHAPPY YOU ARE";
	}

}
