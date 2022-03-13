package com.greatlearning.smsapp;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {

	public List<Student> findAll();
	
	public List<Student> searchBy(String name, String country);
	
	public Student findById(int id);
	
	public void save(Student student); // save or update
	
	public void deleteById(int id);
}
