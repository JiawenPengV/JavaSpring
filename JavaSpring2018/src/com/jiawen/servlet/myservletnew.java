package com.jiawen.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiawen.service.WelcomeService;

/**
 * Servlet implementation class myservlet
 */
@WebServlet("/myservletNew")
public class myservletnew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myservletnew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Create te data and add to the request object
		//invoking business layer
		
		
		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Vivian");
		
		request.setAttribute("myWelcomeMessage", welcomeMessage);
		
		
		//2. Retrieve request dispacher
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("welcomeNew.jsp");
		
		
		//3. Forward the request to the view
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
