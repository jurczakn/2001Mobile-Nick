package com.revature.driver;

import com.revature.util.LoggerUtil;

public class Driver {

	private static LoggerUtil log = new LoggerUtil();
	
	public static void main(String[] args) {

		log.fatal("This is a fatal message");
		log.error("This is a error message");
		log.warn("This is a warn message");
		log.debug("This is a debug message");
		log.info("This is a info message");
		log.trace("This is a trace message");
		
	}

}
