package com.greatlearning.springdemo.coaches;

import org.springframework.stereotype.Component;

import com.greatlearning.springdemo.advices.ExpertAdvice;

@Component //class level annotation 
public class FootballCoach implements SportsCoach {

	// define a private field for the dependency
	private ExpertAdvice expertAdvice;

	public FootballCoach() {
	}

	// define a constructor for dependency injection
	public FootballCoach(ExpertAdvice theExpertAdvice) {
		expertAdvice = theExpertAdvice;
	}

	@Override
	public String getTrainingSchedule() {
		return "Practice dribbling";
	}

	@Override
	public String getAdvice() {
		// use expertAdvice to get the advice
		return expertAdvice.getAdvice();
	}
}
