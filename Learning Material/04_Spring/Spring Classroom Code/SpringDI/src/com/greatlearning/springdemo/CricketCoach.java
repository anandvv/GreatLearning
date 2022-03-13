package com.greatlearning.springdemo;

public class CricketCoach implements SportsCoach {
	
	
	// define a private field for the dependency
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

	@Override
	public String getAdvice() {
		// use expertAdvice to get the advice
		return expertAdvice.getAdvice();
	}

}
