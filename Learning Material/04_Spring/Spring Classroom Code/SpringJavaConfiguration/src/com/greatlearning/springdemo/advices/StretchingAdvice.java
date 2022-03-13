package com.greatlearning.springdemo.advices;

import org.springframework.stereotype.Component;

@Component("abc")
public class StretchingAdvice implements ExpertAdvice {

	@Override
	public String getAdvice() {
		
		return " Do good warm up and streching";
	}

}
