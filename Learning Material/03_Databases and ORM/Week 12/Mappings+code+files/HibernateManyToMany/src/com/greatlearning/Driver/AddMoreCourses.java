

	package com.greatlearning.Driver;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	import com.greatlearning.entity.Course;
	import com.greatlearning.entity.Review;
	import com.greatlearning.entity.Student;
	import com.greatlearning.entity.Teacher;
	import com.greatlearning.entity.TeacherDetails;

	public class AddMoreCourses {


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
				
				int theStudentId=1;
				
				Student tempStudent = session.get(Student.class, theStudentId);
				
				System.out.println(tempStudent);
				
				//creating more courses
				Course tempCourse1 = new Course("CyberSecurity");
				Course tempCourse2 = new Course("Game Development");
				
				//add students to the courses
				tempCourse1.addStudent(tempStudent);
				tempCourse2.addStudent(tempStudent);
				
				//save the courses
				session.save(tempCourse1);
				session.save(tempCourse2);
				
				session.getTransaction().commit();
				
				System.out.println("Completed");
				
			} finally {
				//add a clean up code
				session.close();
				
				factory.close();
			}
		}
	}



