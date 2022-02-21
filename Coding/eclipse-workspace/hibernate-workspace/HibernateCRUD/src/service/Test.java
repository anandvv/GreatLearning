package service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Test {
	public static void main(String[] args) {
		//insertExample();
		
		queryExample();
		
		//readMultipleRecords();
		
		//updateExample();
		
		//deleteExample();
	}

	private static void deleteExample() {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		List<Teacher> teachers = null;
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		System.out.println("created");
		
		Transaction tx = null;
		
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			
			//update last name of a teacher -- METHOD 1
			//Teacher teacher = session.get(Teacher.class, 2);
			//session.delete(teacher);
			
			//deleting record using createQuery and executeQuery -- METHOD 2
			session.createQuery("delete from Teacher where id = 3").executeUpdate();
			
			tx.commit();
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
		
	}

	private static void updateExample() {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		List<Teacher> teachers = null;
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		System.out.println("created");
		
		Transaction tx = null;
		
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			
			//update last name of a teacher -- METHOD 1
			Teacher teacher = session.get(Teacher.class, 2);
			teacher.setL_name("Jones");
			//session.update(teacher);
			//METHOD 2 - to update multiple records this is the way
			session.createQuery("update Teacher set email='sheetal@gl.com' where id=2" ).executeUpdate();
			
			tx.commit();
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}

	private static void readMultipleRecords() {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		List<Teacher> teachers = null;
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		System.out.println("created");
		
		Transaction tx = null;
		
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			teachers = session.createQuery("from Teacher where email like '%gl.com'").list();
			for(Teacher teacher:teachers) {
				System.out.println(teacher);
			}
			tx.commit();
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
		
		for(Teacher teacher:teachers) {
			System.out.println(teacher);
		}
		
	}

	private static void queryExample() {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		System.out.println("created");
		
		Transaction tx = null;
		
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			Teacher teacher = session.get(Teacher.class, 1);
			System.out.println("teacher: " + teacher.getF_name() + " " + teacher.getL_name());
			tx.commit();
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}

	private static void insertExample() {
		System.out.println("Connecting to database");
		SessionFactory factory = null;
		Session session = null;
		
		factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.buildSessionFactory();
		
		System.out.println("created");
		
		Teacher t1 = new Teacher("Shalini", "Garg", "shalinig@gl.com");
		Teacher t2 = new Teacher("Sheetu", "Kapoor", "sheetu@gl.com");
		Teacher t3 = new Teacher("Ria", "Dhopte", "ria@gl.com");
		Teacher t4 = new Teacher("Jenny", "Joe", "jenny@gl.com");
		
		Transaction tx = null;
		
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(t1);
			session.save(t2);
			session.save(t3);
			session.save(t4);
			tx.commit();
		}catch(Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
	}
}
