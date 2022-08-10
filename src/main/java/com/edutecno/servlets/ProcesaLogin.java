package com.edutecno.servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/servicioLogin")
public class ProcesaLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String password_autorizada = "admin";
		String password = request.getParameter("password");
		if(password.equals(password_autorizada)) {
			request.getRequestDispatcher("ingresoValores.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("loginFailed.jsp").forward(request, response);
		}

	}

}
