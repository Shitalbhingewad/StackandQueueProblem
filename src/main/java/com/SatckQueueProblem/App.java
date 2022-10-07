package com.SatckQueueProblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("Welcome to Stack and Queue Problems");
		Stack s = new Stack();
		s.push(70);
		s.push(30);
		s.push(56);
		s.showStack();
	}
}
