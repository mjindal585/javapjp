package com.wipro.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.DAO.EmployeeDAO;
import com.wipro.bean.Employee;

public class DisplayEmployee extends HttpServlet {
	private static final long serialVersionUID = 10283197L;
	static EmployeeDAO dao=new EmployeeDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
        ArrayList < Employee > listUser = dao.DisplayAllEmployee();
        System.out.println(listUser);
        request.setAttribute("listUser", listUser);
        request.getRequestDispatcher("DisplayEMP.jsp").forward(request, response);

	}

}
