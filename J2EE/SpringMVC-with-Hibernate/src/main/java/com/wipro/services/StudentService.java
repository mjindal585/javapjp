package com.wipro.services;

import java.util.List;

import com.wipro.bean.Student;

public interface StudentService {	 
	     
	    public void addStudent(Student student);
	 
	    public List<Student> getAllStudent();
	 
	    public void deleteStudent(Integer StudentId);
	 
	    public Student getStudent(int Studentid);
	 
	    public Student updateStudent(Student Student);
	}

