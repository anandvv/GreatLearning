package com.greatlearning.Driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.greatlearning.entity.Course;
import com.greatlearning.entity.Review;
import com.greatlearning.entity.Student;
import com.greatlearning.entity.Teacher;
import com.greatlearning.entity.TeacherDetails;

public class CreateCourseAndStudent {

	public static void main(String[] args) {

		// create session factory
		SessionFactory factory = new Configuration()
				                 .configure("hibernate.cfg.xml")
				                 .addAnnotatedClass(Teacher.class)
				                 .addAnnotatedClass(TeacherDetails.class)
				                 .addAnnotatedClass(Course.class)
				                 .addAnnotatedClass(Review.class)
				                 .addAnnotatedClass(Student.class)
				                 .buildSessionFactory();

		// create session
		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			
			// create the objects
			Teacher theTeacher = new Teacher("Amy","Suri", "Amy@gl.com");
			
			// create the objects
			Course tempCourse = new Course("python");
			
			session.save(tempCourse);

			//create the students
			Student tempStudent1 = new Student("Arjun","Vashisht","Arjun@gl.com");
			Student tempStudent2 = new Student("Himesh","Rastogi","Himesh@gl.com");
			
			//add students to the course
			tempCourse.addStudent(tempStudent1);
			tempCourse.addStudent(tempStudent2);
			
			//save the students
			System.out.println("Saving Student");
			session.save(tempStudent1);
			session.save(tempStudent2);
			
			//commit transaction
			session.getTransaction().commit();
			
			System.out.println("Completed");
			
			
		} finally {
			//add a clean up code
			session.close();
			
			factory.close();
		}
	}
}


