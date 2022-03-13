package com.greatlearning.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.greatlearning.springdemo.advices.DietAdvice;
import com.greatlearning.springdemo.advices.ExpertAdvice;
import com.greatlearning.springdemo.advices.PracticeAdvice;
import com.greatlearning.springdemo.coaches.CricketCoach;
import com.greatlearning.springdemo.coaches.SportsCoach;

@Configuration
@ComponentScan("com.greatlearning.springdemo") // scan for the classes with @Component annotation
                                               // @component annotation will tell the container to create a bean of them

public class SpringConfiguration {

	// defining PracticeAdvice
//	@Bean
//	public ExpertAdvice dietAdvice() {
//		return new DietAdvice();
//	}
//
//	// define bean of CricketCoach and inject dependency
//	@Bean
//	public SportsCoach cricketCoach() {
//		return new CricketCoach(dietAdvice());
//	}
}
