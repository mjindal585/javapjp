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

import com.wipro.bean.UserDetails;

import com.wipro.service.UserService;

@Controller
public class UserController {

	UserService us;

    public UserService getUserService() {
        return us;
    }

    @Autowired
    public void setUserService(UserService userDAO) {
        this.us = userDAO;
    }
	UserDetails ud=new UserDetails();
	
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
			ModelAndView mv=new ModelAndView("Success","msg","User Looged In Successfully.");
			return mv;
			}
		else
		{
			ModelAndView mv=new ModelAndView("Success","msg","Invalid Customer ID or Password");
			return mv;
		}
		
	}
}
