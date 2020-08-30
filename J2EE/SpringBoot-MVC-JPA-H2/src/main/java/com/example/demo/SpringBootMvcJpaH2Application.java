package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class SpringBootMvcJpaH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcJpaH2Application.class, args);
	}

}


@Controller
class Control{
	@Autowired EmployeeDAO dao;
	  
	  @RequestMapping("/") public String Home() { 
		  return "empHome"; 
		  }
	  
	  @RequestMapping("/AddEmp") public ModelAndView ADDEMP(Employee e) {
	  ModelAndView mv=new ModelAndView();
	  dao.save(e);
	  mv.addObject("msg","Record Added");
	  mv.setViewName("empHome");
	  return mv; 
	  }
}