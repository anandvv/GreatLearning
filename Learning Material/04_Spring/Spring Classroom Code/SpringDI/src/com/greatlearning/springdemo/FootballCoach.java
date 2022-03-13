package com.greatlearning.springdemo;

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
		// TODO Auto-generated method stub
		return null;
	}

}
