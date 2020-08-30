package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DAO.EmployeeDAO;

@SuppressWarnings("unused")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static EmployeeDAO dao=new EmployeeDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		String ID=request.getParameter("ID");
		int id=Integer.parseInt(ID);
		request.setAttribute("name", id);
		String r=dao.DeleteEmployee(id);
		
		if(r.equalsIgnoreCase("Successfully Added"))
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		else
			request.getRequestDispatcher("Failure.jsp").forward(request, response);
		
		p.close();
	}

}
