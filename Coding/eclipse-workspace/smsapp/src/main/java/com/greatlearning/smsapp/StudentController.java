package com.greatlearning.smsapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public String listStudents(Model theModel) {
		
		List<Student> students = studentService.findAll();
		theModel.addAttribute("students", students);
		return "list-students"; // /WEB-INF/views/list-students.jsp
		
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormforAdd(Model theModel) {
		Student theStudent = new Student();
		
		theModel.addAttribute("Student",theStudent);
		
		return "Student-form";
		
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormforUpdate(@RequestParam("studentId") int id,Model theModel) {
		Student theStudent = studentService.findById(id);
		
		theModel.addAttribute("Student",theStudent);
		
		return "Student-form";
		
	}
	
	
	
	@PostMapping("/save")
	public String saveStudent(@RequestParam("id") int id,
			@RequestParam("name") String name,@RequestParam("department") String department,@RequestParam("country") String country) {
	
		System.out.println(id);
		
	Student theStudent;
	
	if(id!=0) {
		theStudent  = studentService.findById(id);
		theStudent.setName(name);
		theStudent.setDepartment(department);
		theStudent.setCountry(country);
	}
	else
		theStudent = new Student(name, department, country);
	studentService.save(theStudent);
	
	return "redirect:/students/list";
	
}
	
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("studentId") int theId) {

		// delete the Student
		studentService.deleteById(theId);

		// redirect to /students/list
		return "redirect:/students/list";

	}
}