package com.revature.util;

import org.apache.log4j.Logger;

public class LoggerUtil {
	
	private static Logger log = Logger.getRootLogger();
	
	public static void fatal(String m) {
		log.fatal(m);
	}
	public static void error(String m) {
		log.error(m);
	}
	public static void warn(String m) {
		log.warn(m);
	}
	public static void debug(String m) {
		log.debug(m);
	}
	public static void info(String m) {
		log.info(m);
	}
	public static void trace(String m) {
		log.trace(m);
	}

}
