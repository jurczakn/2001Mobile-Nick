package com.revature.driver;

import java.lang.reflect.Field;

public class ReflectionExample {

	public static void main(String[] args) {

		String var = "foo";
		
		System.out.println("Initial contents: " + var);
		
		Class<String> string = String.class;
		
		try {
			
			Field field = string.getDeclaredField("value");
			field.setAccessible(true);
			field.set(var, "Something else".toCharArray());
			System.out.println("new contents: " + var);
			System.out.println("foo");
		} catch (NoSuchFieldException e) {
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
