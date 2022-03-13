package com.greatlearning.springdemo;

public class MainDriver {

	// demonstrates the traditional approach to call the methods.
	public static void main(String[] args) {
		
		//Creating object of CricketCoach
		SportsCoach sportsCoach = new CricketCoach();
		
		FootballCoach footballCoach = new FootballCoach();
		System.out.println(footballCoach.getTrainingSchedule());		
		//Calling the methods
		System.out.println(sportsCoach.getTrainingSchedule());
	}
}
