package com.registration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection con;
	private String userspwd;
       
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("name");
		String uemail = request.getParameter("email");
		String upwd = request.getParameter("pass");
		String umoblie = request.getParameter("contact");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");   con =DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","admin");
			PreparedStatement pst = con.prepareStatement("insert into users(usersname,userspwd,usersemail,usermoblieno) values(?,?,?,?)");
			pst.setString(1, uname);
			pst.setString(2, userspwd);
			pst.setString(3, uemail);
			pst.setString(4,umoblie);
		}catch
		
		
	}

}
