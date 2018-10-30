package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.servlets.dao.UserDao;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		String email=request.getParameter("email");
		String mobile=request.getParameter("number");
		UserDao dao=new UserDao();
		int n=dao.add(username,password,email,mobile);
		if(n>0){
			out.print("registration successful");
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.include(request,response);
		}
		else{
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp?emsg=something went wrong, try agian");
			rd.include(request,response);
		}
	}
}