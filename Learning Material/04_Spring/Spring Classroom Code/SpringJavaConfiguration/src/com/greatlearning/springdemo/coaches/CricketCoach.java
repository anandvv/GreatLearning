package com.greatlearning.springdemo.coaches;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.greatlearning.springdemo.advices.ExpertAdvice;

@Component  //here we can use @Service, @Repository @Controller, & vice versa.
//@Scope("prototype")
public class CricketCoach implements SportsCoach {

	// define a private field for the dependency
	// @Autowired
    @Qualifier("abc")
	@Autowired
	private ExpertAdvice expertAdvice;

	public CricketCoach() {
	}

	// define a constructor for dependency injection
	public CricketCoach(ExpertAdvice theExpertAdvice) {
		expertAdvice = theExpertAdvice;
	}

	@Override
	public String getTrainingSchedule() {

		return "Practice Straight Drive";
	}

	@PostConstruct
	public void postConstruct() {
		System.out.println("inside post construct");
	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("inside pre destroy");
	}
	
	@Override
	public String getAdvice() {
		// use expertAdvice to get the advice
		return expertAdvice.getAdvice();
	}

}
