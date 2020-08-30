package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class SpringBootWebAppMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebAppMvcApplication.class, args);	
		
	}

}
@Controller
class Controll{
	
	@RequestMapping("/") 
	public String Home() { return "Home"; }
	
	  @RequestMapping("/Login") 
	  public ModelAndView Login(@RequestParam("name") String n, @RequestParam("pswd") String p) {
		  ModelAndView mv=new  ModelAndView();
		  if(n.equalsIgnoreCase(" ") &&   p.equalsIgnoreCase("Wipro@123")) { 
			  mv.addObject("msg", "Login Successful");
			  mv.setViewName("Success1"); } 
		  else { 
			  mv.addObject("msg", "Login Failed");
			  mv.setViewName("Success1"); }
	  
		  return mv; }
}
