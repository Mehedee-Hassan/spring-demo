package com.text.autoconfig;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "Happy fortune service Cricket";
	}

}
