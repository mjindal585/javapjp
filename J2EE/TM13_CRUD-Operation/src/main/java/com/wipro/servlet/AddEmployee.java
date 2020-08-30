package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DAO.EmployeeDAO;
import com.wipro.bean.Employee;

@SuppressWarnings("unused")
public class AddEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static EmployeeDAO dao=new EmployeeDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		String ename=request.getParameter("name");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String desg=request.getParameter("desg");
		String gender=request.getParameter("gender");
		String sal=request.getParameter("sal");
		double salary=Double.parseDouble(sal);
		String ph=request.getParameter("phone");
		long phone=Long.parseLong(ph);
		request.setAttribute("name", ename);
		Employee e=new Employee(ename,gender,city,desg,email,salary,phone);
		String r=dao.AddEmployee(e);
		if(r.equalsIgnoreCase("Successfully Added"))
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		
		p.close();
	}

}
