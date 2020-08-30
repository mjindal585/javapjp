package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Student;
import com.wipro.dao.StudentDAO;

/*Spring MVC with Hibernate

1 Create a Spring based MVC application which collects Student details from the user and 
inserts them into the database
*/

@SuppressWarnings("unused")
public class SpringMVCwithHibernate1 {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/PreInsertStudent")
	public ModelAndView preinsertstudent()
	{
		Student std=new Student();
		std.setStudentId(dao.getStudentId());
		ModelAndView mv=new ModelAndView("InsertStudent","std",std);
		return mv;
	}

	@RequestMapping("/InsertStudent")
	public String insertStudent(Model mv,@ModelAttribute("std") Student std)
	{
		mv.addAttribute("std",std);
if(dao.addStudent(std))
	mv.addAttribute("msg", "Inserted Successfully");
else
	mv.addAttribute("msg", "Insertion Failure");
return "StudentDisplay";
		
	}
}
