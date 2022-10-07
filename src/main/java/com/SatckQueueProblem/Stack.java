package com.SatckQueueProblem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Stack {
	  private static final Logger logger = LogManager.getLogger(App.class);
	    private Node top;
	    public Stack() {
	        this.top = null;
	    }

	    
	    public void push(int x) {
	        Node node = new Node();
	        node.data = x;
	        node.next = top;
	        top = node;
	    }

	   
	    public boolean isEmpty() {
	        return top == null;
	    }

	    // print method
	    void showStack() {

	        Node temp = top;
	        if (isEmpty()) {
	            logger.info("Stack Is Empty!");
	        } else {
	            while (temp.next != null) {
	                logger.info(temp.data);
	                temp = temp.next;
	            }
	            logger.info(temp.data);
	        }
	    }
	}