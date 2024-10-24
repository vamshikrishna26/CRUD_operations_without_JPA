package com.example.sb02.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.sb02.dao.Student;

@RestController
public class StudentController {
	
	@RequestMapping("/")
	public String getHome() {
		return "Hello, Welcome";
	}

	
	
	@GetMapping("student")
	public Student getStudent() {
		Student s=new Student("Vamshi krishna","Aeddula");
		return s;
		
	}
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> l1=new ArrayList<>();
		Student s1=new Student("Vamshi krishna","Aeddula");
		Student s2=new Student("Mahesh","Akula");
		Student s3=new Student("Narendra","Alapuram");
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		return l1;
	}
	
	@PostMapping("/students/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student){
		return student;	
	}
	
	@PutMapping("/update/{lName}")
	@ResponseStatus(HttpStatus.CONTINUE)
	public Student updateStudent(@RequestBody Student student,@PathVariable("lName") String lName) {
		return student;
		
	}
	
	@DeleteMapping("/delete/{lName}")
	@ResponseStatus(HttpStatus.GONE)
	public String deleteStudent(@PathVariable("lName") String lName) {
		return "delete Successfully";
	}

}
