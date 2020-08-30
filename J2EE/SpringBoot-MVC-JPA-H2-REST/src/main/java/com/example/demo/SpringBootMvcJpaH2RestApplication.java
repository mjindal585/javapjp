package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SuppressWarnings("unused")
@SpringBootApplication
public class SpringBootMvcJpaH2RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMvcJpaH2RestApplication.class, args);
	}

}


@Controller
class Controll{
	@Autowired 
	EmployeeDAO dao;
	
	@RequestMapping("/")
	public ModelAndView Menu()
	{
		ModelAndView mv=new ModelAndView("Menu");
		return mv;
	}
	
	@RequestMapping("AddEmp")
	public ModelAndView AddEmp()
	{
		
		ModelAndView mv=new ModelAndView("ADDEMP");
		return mv;
	}
	
	@RequestMapping("Modify")
	public ModelAndView Modify(Model m)
	{
		ModelAndView mv=new ModelAndView("MODIFYEMP");
		return mv;
	}
	
	@RequestMapping("DeleteEmp")
	public String Delete(Model m)
	{
		Employee ed=new Employee();
		m.addAttribute("ed", ed);
		return "DeleteEmployee";
	}
	@RequestMapping("DispById")
	public ModelAndView DispById(Model m)
	{
		ModelAndView mv=new ModelAndView("DisplayEmpById");
		return mv;
	}
	@RequestMapping("DisplayAll")
	public ModelAndView getEmp()
	{
		List<Employee> l=dao.findAll();
		ModelAndView mv=new ModelAndView();
		mv.addObject("l1", l);
		mv.setViewName("DisplayEMP");
		return mv;
	}
	@RequestMapping("/updatemp")
	public ModelAndView UpdateEmp(Employee e) {
		dao.save(e);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Records Updated");
		mv.setViewName("Success");
		return mv;
	}
	
	@RequestMapping("/AddEmployee")
	public ModelAndView AddEmp(Employee e)
	{
		dao.save(e);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Records Added");
		mv.setViewName("Success");
		return mv;
	}
	@RequestMapping("/DeleteEmpById")
	public ModelAndView DeleteEmp(@RequestParam("id") int id)
	{
		dao.deleteById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Record Deleted");
		mv.setViewName("Success");
		return mv;
	}
	
	@RequestMapping("DisplayEmp")
	public ModelAndView getEmp(@RequestParam("id") int id)
	{
		Optional<Employee> l=dao.findById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("l1", l);
		mv.setViewName("DisplayEMP");
		return mv;
	}
}