package ca.bcit.comp4613.lab01.controller;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ca.bcit.comp4613.lab01.domain.User;
import ca.bcit.comp4613.lab01.services.UserServices;
import ca.bcit.comp4613.lab01.services.UserServicesImpl;

public class GreetingServlet extends HttpServlet {

	private static final long serialVersionUID = 1250885873398566264L;
	private UserServices services;
	
	@Override
	public void init() throws ServletException {
		services = new UserServicesImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter( "firstName" );

		if ( name != null && name.trim().length() > 0) {
			User user = new User(name);
			request.setAttribute("user", user);
			LocalDateTime now = LocalDateTime.now();
			services.save(user, now);
			
			request.setAttribute("now", now.format( DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			getServletContext().getRequestDispatcher("/greeting.jsp").forward(request, response);
		}
		else {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
