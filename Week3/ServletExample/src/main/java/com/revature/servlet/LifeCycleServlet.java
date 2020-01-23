package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Servlet Lifecycle
 * 
 * init - Initialized the servlet in the servlet container (web container)
 * 		Called once
 * 			- either on first request(defualt) or on startup	
 * 
 * service - Handles a request to this servlet.  Basically forwards request to approriate method(doGet, doPost, doDelet, doHead ...)
 * 		- NOTE: this method is abstract in GenericServlet
 * 		- NOTE: this method is implemented in HttpServlet
 * 		- called on every request to the servlet
 * 
 * destroy - Destroys the servlet.
 * 			- Typically called when servlet container stops/restarts
 * 				- Most likely not called during normal operation
 * 				- usually only on shutdown and only once
 * 
 */

public class LifeCycleServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside doGet of LifecycleServlet");
		resp.getWriter().write("<h1>Success</h1>");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside service of LifecycleServlet");
		super.service(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("Inside destroy of LifecycleServlet");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Inside init of LifecycleServlet");
		super.init();
	}
	
	

}
