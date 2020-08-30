package com.wipro.dao;

import java.util.List;


import com.wipro.bean.Student;

public interface StudentDAO {

 
    public boolean addStudent(Student student);
 
    public void deleteStudent(Integer StudentId);
 
    public Student updateStudent(Student student);
 
    public Student getStudent(int StudentId);

	public List<Student> getAllStudent();

	public int getStudentId();
}
