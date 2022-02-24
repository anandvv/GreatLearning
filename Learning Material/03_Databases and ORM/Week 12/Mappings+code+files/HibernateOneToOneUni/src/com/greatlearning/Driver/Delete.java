package com.greatlearning.Driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Teacher;
import com.greatlearning.entity.TeacherDetails;

public class Delete {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			int theTeacherId=1;
			
			// start transaction
			session.beginTransaction();

			Teacher tempTeacher = session.get(Teacher.class,theTeacherId);
			
			if(tempTeacher!=null) {
				System.out.println("Deleting : "+ tempTeacher);
				
				//Note!! : it will also delete TeacherDetails data 
			    //         as we have provided CascadeType.ALL
				session.delete(tempTeacher);
			}
			
			

			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}
