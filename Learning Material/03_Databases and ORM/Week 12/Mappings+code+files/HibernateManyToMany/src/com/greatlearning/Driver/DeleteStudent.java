package com.greatlearning.Driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Course;
import com.greatlearning.entity.Review;
import com.greatlearning.entity.Student;
import com.greatlearning.entity.Teacher;
import com.greatlearning.entity.TeacherDetails;

public class DeleteStudent {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class)
				.addAnnotatedClass(Course.class)
				 .addAnnotatedClass(Review.class)
				 .addAnnotatedClass(Student.class)
				 .buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			int theStudentId=1;
			
			// start transaction
			session.beginTransaction();

			Student tempStudent = session.get(Student.class,theStudentId);
			
			if(tempStudent!=null) {
				System.out.println("Deleting : "+ tempStudent);
				
				//Note!! : it will not delete Course data 
			    //         as we have not provided CascadeType.ALL
				session.delete(tempStudent);
			}
			
			

			// commit transaction
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}
}
