package com.greatlearning.Driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Teacher;
import com.greatlearning.entity.TeacherDetails;

public class Insert {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			// create the objects
			Teacher tempTeacher = new Teacher("Harshit", "Choudhary", "HarshitChoudhary@greatlearning.com");

			TeacherDetails tempTeacherDetails = new TeacherDetails("Gurugram", "ReadingBooks");

			// associate the objects
			tempTeacher.setTeacherDetails(tempTeacherDetails);
		

			// start transaction
			session.beginTransaction();

			// save the teacher
			session.save(tempTeacher);
			

			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}
