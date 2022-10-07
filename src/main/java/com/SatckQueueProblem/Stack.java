package com.SatckQueueProblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Stack {
    private static final Logger logger = LogManager.getLogger(App.class);
    private Node top;

    public Stack() {
        this.top = null;
    }

    // insert at start of List
    public void push(int x) {
        Node node = new Node();
        node.data = x;
        node.next = top;
        top = node;
    }

    // check stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // print nodes of list
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

    // do not pop only print top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }

    // function to pop a top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
        int top = peek();
        this.top = (this.top).next;
        return top;
    }
}