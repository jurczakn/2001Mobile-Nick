package com.revature.driver;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) { // throws RuntimeException {

		// throw new RuntimeException();

		try {
			throwsException();
			System.out.println("Something else");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception caught");
		} finally {
			System.out.println("This will always run");
		}
		
		uncheckedException();
		
		try {
			//risky code
		} catch (Exception e) {
			//handle exception
		}
		
		try {
			
		} catch (Exception e) {
			
		} finally {
			
		}
		
		try {
			
			throwsException();
			
		} catch (IOException e) {
			 
		} catch (Exception e) {
			
		} finally {
			
		}
		
		try {
			System.out.println("Hello");
		} finally {
			System.out.println("This will always run 2");
		}

	}

	private static void throwsException() throws Exception {
		throw new IOException("This is a test exception");
	} 
	
	private static void uncheckedException() {
		throw new RuntimeException();
	}

}
