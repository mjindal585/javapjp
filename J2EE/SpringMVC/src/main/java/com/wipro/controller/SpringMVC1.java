package com.wipro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*Spring MVC

1 Using Spring MVC write a HelloWorld Program
*/
@Controller
public class SpringMVC1 {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Helloworld";
	}

}
