package com.Pro2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pro2")
public class Pro2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		int number = Integer.parseInt(request.getParameter("number"));
		
		// https://www.programmergate.com/pass-data-servlet-jsp/
		// https://www.javatpoint.com/requestdispatcher-in-servlet
		request.setAttribute("number", number);
		
		if (number < 10)
			request.getRequestDispatcher("page1.jsp").forward(request, response);
		else if (number >= 10 && number < 99)
			request.getRequestDispatcher("page2.jsp").forward(request, response);
		else
			request.getRequestDispatcher("error.jsp").forward(request, response);
		
		out.close();
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	

}
