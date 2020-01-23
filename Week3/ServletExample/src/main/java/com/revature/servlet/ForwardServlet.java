package com.revature.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Forward
 *  - pass the req and resp to a new resource
 *  - the new resource responds back to the client
 *  - Pro: faster(only 1 request and response) & request Scope is maintained
 *  - Cons: client is unaware of what is happening (could be pro)
 */
public class ForwardServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet of ForwardServlet");
		RequestDispatcher rd = req.getRequestDispatcher("hello");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getMethod());
		System.out.println("Inside doPost of ForwardServlet");
		RequestDispatcher rd = req.getRequestDispatcher("hello");
		rd.forward(req, resp);
	}
	
	

}
