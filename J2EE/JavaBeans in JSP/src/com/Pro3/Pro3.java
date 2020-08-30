package com.Pro3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Pro3")
public class Pro3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	Connection conn = null;
	PreparedStatement pstmt = null;
    public Pro3() {

		conn = DBUtil.getConnection();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		conn = DBUtil.getConnection();

		String sql = "INSERT INTO emp_test VALUES(?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, request.getParameter("name"));
			pstmt.setInt(2, Integer.parseInt(request.getParameter("id")));
			pstmt.setString(3, request.getParameter("designation"));
			pstmt.executeUpdate();
			out.println("Success");
			request.setAttribute("result", "Success");
		} catch (SQLException e) {
			request.setAttribute("result", "Failed");
			out.println("Failed");
			e.printStackTrace();
		}
		

		out.close();
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
