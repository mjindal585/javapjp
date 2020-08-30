package com.wipro.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.bean.Student;
import com.wipro.dao.*;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO StudentDAO;
 
	@Override
    @Transactional
    public void addStudent(Student student) {
    	StudentDAO.addStudent(student);
    }
    
    @Override
    @Transactional
    public List<Student> getAllStudent() {
        return StudentDAO.getAllStudent();
    }
 
    @Override
    @Transactional
    public void deleteStudent(Integer StudentId) {
    	StudentDAO.deleteStudent(StudentId);
    }

    public Student getStudent(int Studentid) {
        return StudentDAO.getStudent(Studentid);
    }

    public Student updateStudent(Student student) {
        // TODO Auto-generated method stub
        return StudentDAO.updateStudent(student);
    }

    public void setStudentDAO(StudentDAO studentDAO) {
        this.StudentDAO = studentDAO;
    }
 
}