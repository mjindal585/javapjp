package com.wipro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Employee;
import com.wipro.bean.UserDetails;
import com.wipro.service.EmployeeService;
import com.wipro.service.UserService;

@Controller
public class UserController {

	UserService us;
	EmployeeService es;

    @Autowired
    public void setUserService(UserService userDAO) {
        this.us = userDAO;
    }
    @Autowired
    public void setEmployeeService(EmployeeService userDAO) {
        this.es = userDAO;
    }
	UserDetails ud=new UserDetails();
	Employee ed=new Employee();
	
	@RequestMapping("Register")
	public ModelAndView Register(Model m)
	{
		UserDetails ud=new UserDetails();
		ModelAndView mv=new ModelAndView("Register","ud", ud);
		return mv;
	}
	
	@RequestMapping("Login")
	public ModelAndView Login(Model m)
	{
		UserDetails ud=new UserDetails();
		ModelAndView mv=new ModelAndView("Login","ud", ud);
		return mv;
	}
	
	@RequestMapping("/AfterRegister")
public String addPerson(@ModelAttribute("ud") @Valid UserDetails p,BindingResult r,Model m,@RequestParam("Username") String cid, @RequestParam("Password") String pswd){
		System.out.println(us.listPersons());
		if(r.hasErrors())
		{
			return "AfterRegister";
		}
		else {
		if(us.getCustomer(cid, pswd))
		{	System.out.println("\n\n\n\nUser Already Exists");
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","User already Exists");
		return "Register"; 
		}
		else {
			us.addPerson(p);
			ModelAndView mv=new ModelAndView();
			mv.addObject("msg","User Registered Successfully.");
			return "Success";
		}
		}
	}
	@RequestMapping("AfterLogin")
	public ModelAndView AfterLogin(@ModelAttribute("ud") UserDetails p,@RequestParam("Username") String cid, @RequestParam("Password") String pswd) {
		if(us.getCustomer(cid, pswd))		
			{
			ModelAndView mv=new ModelAndView("Menu","msg","Choose an option to proceed");
			return mv;
			}
		else
		{
			ModelAndView mv=new ModelAndView("Login","msg","Invalid Customer ID or Password");
			return mv;
		}
		
	}
	
	@RequestMapping("AddEmp")
	public ModelAndView AddEmp(Model m)
	{
		Employee ed=new Employee();
		ModelAndView mv=new ModelAndView("ADDEMP","ed", ed);
		return mv;
	}
	
	@RequestMapping("Modify")
	public ModelAndView Modify(Model m)
	{
		Employee ed=new Employee();
		ModelAndView mv=new ModelAndView("MODIFYEMP","ed", ed);
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
		Employee ed=new Employee();
		ModelAndView mv=new ModelAndView("DisplayEmpById","ed", ed);
		return mv;
	}
	
	@RequestMapping("DisplayAll")
	public ModelAndView DisplayAll(Model m)
	{
		Employee ed=new Employee();
		
		ModelAndView mv=new ModelAndView("DisplayEMP","p", es.listPersons());
		mv.addObject("ed", ed);
		return mv;
	}
	
	@RequestMapping("NewEmpDetails")
	public ModelAndView NewEmpDetails(Model m)
	{
		Employee ed=new Employee();
		ModelAndView mv=new ModelAndView("NewEMPDetails","ed", ed);
		return mv;
	}
	
	
	@RequestMapping("AddEmployee")
	public ModelAndView AddEmployee(@ModelAttribute("ed") Employee e)
	{
		System.out.println(e);
		es.addPerson(e);
		ModelAndView mv=new ModelAndView("Success","msg","User Registered Successfully.");
		return mv;
	}
	
	@RequestMapping("DisplayEmp")
	public ModelAndView DisplayEmployee(@ModelAttribute("ed") Employee e, @RequestParam("id") int eid)
	{
		
		ModelAndView mv=new ModelAndView("DisplayEMP","p",es.getPersonById(eid));
		return mv;
	}
	@RequestMapping("Update")
	public ModelAndView UpdateEmp(@ModelAttribute("ed") Employee e)
	{
		es.updatePerson(e);
		ModelAndView mv=new ModelAndView("Success","msg","Employee Details Updated Successfully.");
		return mv;
	}
	
	@RequestMapping("DeleteEmpById")
	public ModelAndView DeleteEmployee(@ModelAttribute("ed") Employee e,@RequestParam("id") int eid)
	{
		es.removePerson(eid);
		ModelAndView mv=new ModelAndView("Success","msg","Employee Details Deleted Successfully.");
		return mv;
	}
}
