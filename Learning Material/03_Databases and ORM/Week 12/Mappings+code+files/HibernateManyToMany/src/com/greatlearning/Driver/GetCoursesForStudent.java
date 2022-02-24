
package com.greatlearning.Driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Course;
import com.greatlearning.entity.Review;
import com.greatlearning.entity.Student;
import com.greatlearning.entity.Teacher;
import com.greatlearning.entity.TeacherDetails;

public class GetCoursesForStudent {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class)
				.addAnnotatedClass(TeacherDetails.class).addAnnotatedClass(Course.class).addAnnotatedClass(Review.class)
				.addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theStudentId = 1;

			Student tempStudent = session.get(Student.class, theStudentId);

			System.out.println("Student "+tempStudent);
			System.out.println("Courses"+tempStudent.getCourses());
			

			session.getTransaction().commit();

			System.out.println("Completed");

		} finally {
			// add a clean up code
			session.close();

			factory.close();
		}
	}
}
