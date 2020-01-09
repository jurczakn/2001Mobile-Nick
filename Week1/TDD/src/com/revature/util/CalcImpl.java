package com.revature.util;

import com.revature.exception.ResultTooLargeException;

public class CalcImpl<T extends Number> implements Calculator<T> {

	@Override
	public T add(T a, T b) throws ResultTooLargeException {

		Number ret = a.doubleValue() + b.doubleValue();

		if (!(a instanceof Double) && !(a instanceof Float)) {
			
			if (a instanceof Integer) {
				if ((a.intValue() > 0) && (b.intValue() > 0) && (a.intValue() + b.intValue() < 0)) {
					throw new ResultTooLargeException();
				}
			}

			ret = Math.floor(ret.doubleValue());

			ret = ret.intValue();

		}

		return (T) ret;

	}

	@Override
	public T sub(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T mult(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T div(T a, T b) {
		// TODO Auto-generated method stub
		return null;
	}

}
