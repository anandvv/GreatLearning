package com.greatlearning.smsapp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {

		Configuration conf = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory = conf.buildSessionFactory();
		
		StudentService studentService = new StudentServiceImpl(sessionFactory);
		
		
		//get book by Id
//		Book book = bookService.findById(2);
//		System.out.println(book);
		
		//save a book
		//Book book1 = new Book("Design Patterns", "Software Design", "Gang of Four");
		//bookService.save(book1);
		
		//update a book
		//book.setAuthor("H&C");
		//bookService.save(book);
		
		//delete a book
//		try {
//			bookService.deleteById(3);
//		}catch(IllegalArgumentException ex) {
//			System.out.println("The book does not exist");
//		}
		
		//get all books
//		List<Book> books = bookService.findAll();
//		
//		for(Book book11: books) {
//			System.out.println(book11);
//		}
		
		
		String studentName = "Anand";
		String country = "India";
		
		List<Student> students = studentService.searchBy(studentName, country);
		for(Student student: students) {
			System.out.println(student);
		}
	}
}
