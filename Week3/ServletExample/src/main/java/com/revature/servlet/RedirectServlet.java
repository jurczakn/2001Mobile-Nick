package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Redirect
 *  - give url to a new resource
 *  - response will tell the client to sent another request for this resource
 *  - Pro: client is aware of new url
 *  - Con: slower, lose request scope
 */
public class RedirectServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet of RedirectServlet");
		resp.sendRedirect("hello");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doPost of RedirectServlet");
		resp.sendRedirect("hello");
	}

}
