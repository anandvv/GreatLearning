package com.greatlearning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {

	// demonstrates the IOC
	public static void main(String[] args) {

		// 1. load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// 2. retrieve bean from spring container
		SportsCoach sportsCoach = context.getBean("cricketCoach", SportsCoach.class);

		SportsCoach sportsCoach2 = context.getBean("cricketCoach", SportsCoach.class);

		SportsCoach sportsCoach3 = sportsCoach2;

		boolean result = (sportsCoach == sportsCoach2);
		System.out.println(result);
		System.out.println(sportsCoach);
		System.out.println(sportsCoach2);
		System.out.println(sportsCoach3);

		// retrieve bean from spring container
		// SportsCoach theCoach = context.getBean("footballCoach", SportsCoach.class);

		// call methods on the bean
		System.out.println(sportsCoach.getTrainingSchedule());

		// close the context
		context.close();
	}

}
