package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wipro.bean.Coupon;
import com.wipro.bean.Customer;
import com.wipro.dao.CustomerDAO;
import com.wipro.services.CustomerService;

/*
3 Do the Cash Back Offer Exercise from the Mini Projects section
*/

@Controller
public class SpringMVCwithHibernate3 {

	double b;
	@Autowired
	CustomerDAO dao;
	Customer cst=new Customer();
	Customer cmr=new Customer();
	Customer cmr1;
	@Autowired
	CustomerService cs;
	
	public void AddCustomerDetails() {
	
	}
	
	@RequestMapping("CustomerLogin")
	public ModelAndView CustomerLogin()
	{		
		ModelAndView mv=new ModelAndView();
		mv.addObject("cst", cst);
		mv.setViewName("CustomerLogin");
		return mv;
	}
	
	@RequestMapping("AfterLogin")
	public String AfterLogin(Model m,@RequestParam("CustomerID") String cid, @RequestParam("Password") String pswd) {
		b=dao.getCustomer(cid, pswd);
		System.out.println(b);
		if(b!=0) {
			m.addAttribute("Balance",b);
			m.addAttribute("cid", cid);
			m.addAttribute("pswd", pswd);
			m.addAttribute("cst", new Coupon());
			return "EnterCoupon";
		}
		{
			m.addAttribute("msg","Invalid Customer ID or Password");
			return "Failure";
		}
		
	}

	
	@RequestMapping("/EnterCoupon/{cid}/{pswd}/{Balance}")
	public String EnterCoupon(Model mv, @ModelAttribute("cst")Coupon c, @RequestParam(value = "CouponCode", required = false) String cc, @PathVariable double Balance, @PathVariable String cid,@PathVariable String pswd)
	{
		b=Balance;
		System.out.println(b);
		float op=dao.getCoupon(cc);
		System.out.println(op);
		System.out.println(cs.NewBalance(b, op));
		double nb=cs.NewBalance(b,op);
		if(nb!=0)
		{
			mv.addAttribute("NewBalance", nb);
			mv.addAttribute("cid", cid);
			cmr1=new Customer(cid,pswd,nb);
			System.out.println(dao.UpdateCustomer(cmr1));
			mv.addAttribute("cc", cc);
			mv.addAttribute("cst",cst);
			return "CashBack";
		}
		else
		{
			mv.addAttribute("msg","Invalid Coupon Code");
			return "Failure";
		}
	}
	
	@RequestMapping("/index")
	public String CashBack()
	{
		return "index.jsp";
	}
}
