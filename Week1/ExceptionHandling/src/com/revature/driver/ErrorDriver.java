package com.revature.driver;

public class ErrorDriver {

	public static void main(String[] args) {

		try {
			recursive(0);
			throw new StackOverflowError();
		} catch (Error e) {
			e.printStackTrace();
		}
		
		System.out.println("Everything ok");
		
	}
	
	private static void recursive(int x) {
		System.out.println(x++);
		recursive(x);
	}

}
