package com.greatlearning.springdemo.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.greatlearning.configuration.SpringConfiguration;
import com.greatlearning.springdemo.coaches.SportsCoach;

public class SpringDriver {	

	
	//demonstrates the IOC 
	public static void main(String[] args) {
		
			// load the spring configuration file
		AnnotationConfigApplicationContext context = 
					new AnnotationConfigApplicationContext(SpringConfiguration.class);
					
			// retrieve bean from spring container
		   	SportsCoach sportsCoach = context.getBean("cricketCoach", SportsCoach.class);
			
		   	SportsCoach sportsCoach2 = context.getBean("cricketCoach", SportsCoach.class);
		   	
		   	System.out.println(sportsCoach);
			System.out.println(sportsCoach2);
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

