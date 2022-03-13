package com.greatlearning.smsapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class StudentServiceImpl implements StudentService {
	
	
	private SessionFactory sessionFactory;
	private Session session;
	
	
	public StudentServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		this.session = this.sessionFactory.openSession();
	}

	public List<Student> findAll() {
		
		Transaction tx = session.beginTransaction();
		
		// from "EntityName"
		List<Student> students = session.createQuery("from Student", Student.class).list();
		
		tx.commit();
		
		return students;
	}

	public List<Student> searchBy(String name, String country) {
		
		Transaction tx = session.beginTransaction();
		
		String query = "";
		
		if(name.length() != 0 && country.length() != 0) {
			query = "from Student where name like '%" + name + "%' or country like '%" + country + "%'";
		} else if(name.length() != 0) {
			query = "from Student where name like '%" + name + "%'";
		} else if(country.length() != 0) {
			query = "from Student where country like '%" + country + "%'";
		} else {
			System.out.println("No records");
		}
		
		List<Student> students = session.createQuery(query,Student.class).list();
		tx.commit();
		
		return students;
	}

	public Student findById(int id) {
		Transaction tx = session.beginTransaction();
		Student student = session.get(Student.class,id);
		
		tx.commit();
		return student;
	}

	public void save(Student student) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(student);
		tx.commit();
	}

	public void deleteById(int id) {
		Transaction tx = session.beginTransaction();
		
		try {
		Student student = session.get(Student.class, id);
		session.delete(student);
		} finally {
			tx.commit();
		}
		
	}

}