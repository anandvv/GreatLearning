package com.greatlearning.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDriver {	

	
	//demonstrates the IOC 
	public static void main(String[] args) {
			// load the spring configuration file
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
					
			// retrieve bean from spring container
		   	SportsCoach sportsCoach = context.getBean("cricketCoach", SportsCoach.class);
			
			// retrieve bean from spring container
			// SportsCoach sportsCoach = context.getBean("footballCoach", SportsCoach.class);
						
						
			// call methods on the bean
		    System.out.println(sportsCoach.getTrainingSchedule());
		    
		    //call method from our new injected bean
		    System.out.println(sportsCoach.getAdvice());
			
			// close the context
			context.close();
		}

	}

