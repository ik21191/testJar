package com.mypack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJar {
	private static final Logger log = LoggerFactory.getLogger(TestJar.class);
    
	public static String testMethod() {
    	log.info("testMethod() is called.");
    	return "hello";
    }
}
