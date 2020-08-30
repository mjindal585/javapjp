package com.wipro.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.model.TotalMarks;

/*3 Create a form which takes three inputs from the User -> Science marks , Maths marks and English marks
After entering the data, when the user clicks on the submit button, it has to calculate the sum ofthese numbers and 
show the total marks back to the user.Use Spring MVC for this solution and use XML configuration
*/

@SuppressWarnings("unused")
@Controller
public class SpringMVC3 {
	int sm=0,mm=0,em=0,sum=0;
	@RequestMapping("/SendMarks")
	public ModelAndView Display(TotalMarks tm) {
		int s=tm.getS();
		int m=tm.getM();
		int e=tm.getE();
		int sum=s+m+e;
		ModelAndView mv=new ModelAndView("MarksCal","sum",sum);
		return mv;
		
		
	}

}
