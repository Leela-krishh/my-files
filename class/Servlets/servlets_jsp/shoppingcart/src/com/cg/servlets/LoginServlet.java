package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("user");
		String password=request.getParameter("pass");
		if(username.equals("leela") && password.equals("krishh")){
			RequestDispatcher rd=request.getRequestDispatcher("welcome.jsp");
			rd.forward(request, response);
		}
		else{
			out.print("<i><b style='color:red'>User is not yet registered, please register</b></i>");
			RequestDispatcher rd=request.getRequestDispatcher("registration.jsp");
			rd.include(request,response);
		}
//		out.println("<html>");
//		out.println("<body bgcolor='skyblue'>");
//		out.println("<p>welcome mr. "+username+"</p>");
//		out.println("<p>you entered password: "+password+"</p>");
//		out.println("</body></html>");
	}

}
