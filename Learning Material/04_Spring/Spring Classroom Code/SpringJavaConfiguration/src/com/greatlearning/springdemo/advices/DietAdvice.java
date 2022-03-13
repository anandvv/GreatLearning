package com.greatlearning.springdemo.advices;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class DietAdvice implements ExpertAdvice {


	@Override
	public String getAdvice() {
		
		return "Eat healthy";
	}

}
