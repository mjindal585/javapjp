package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DAO.EmployeeDAO;
import com.wipro.bean.Employee;

@SuppressWarnings("unused")
public class DisplayEmployeeByID extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static EmployeeDAO dao=new EmployeeDAO();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String Id=request.getParameter("id");
		int id=Integer.parseInt(Id);
		List<?> employees=dao.DisplayEmployeeByID(id);
        System.out.println(employees);
        request.setAttribute("listUser", employees);
        request.getRequestDispatcher("DisplayEMP.jsp").forward(request, response);
	}
}
