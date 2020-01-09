package com.revature.util;

import com.revature.exception.ResultTooLargeException;

public interface Calculator <T extends Number> {
	
	public T add(T a, T b) throws ResultTooLargeException;
	
	public T sub(T a, T b);
	
	public T mult(T a, T b);
	
	public T div(T a, T b);

}
