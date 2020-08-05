package com.dxc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("inputEmail");
		String pass = request.getParameter("inputPassword");
		RequestDispatcher dispatcher= null;
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		if(email.equals("admin@gmail.com") && pass.equals("password")) {
			HttpSession session = request.getSession();
			session.setAttribute("username", "Swaraj");
			session.setMaxInactiveInterval(30*60);
			response.sendRedirect("dashboard.jsp");
		}else {
			writer.println("<h3 style='colour:red'>Invalid Credentials.... Try Again </h3>");
			dispatcher = request.getRequestDispatcher("login-page.jsp");
			dispatcher.include(request, response);
		}
	}

}
