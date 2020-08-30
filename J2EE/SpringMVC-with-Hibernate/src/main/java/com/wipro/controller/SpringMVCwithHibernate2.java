package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;
import com.wipro.services.StudentService;

/*
 2 Create a Spring based MVC application which displays all the Student details which were inserted earlier
*/


@SuppressWarnings("unused")
public class SpringMVCwithHibernate2 {

	@Autowired
    private StudentService studentService;
	StudentDAO dao;
	@RequestMapping("/ListStudent")
	public ModelAndView listStudent(ModelAndView model)  {
        List<Student> listStudent = studentService.getAllStudent();
        model.addObject("listStudent", listStudent);
        model.setViewName("DisplayStudent");
        return model;
}
}