package service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Test {
	public static void main(String[] args) {
		//insertExample();
		
		queryExample();
	}

	private static void queryExample() {
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
