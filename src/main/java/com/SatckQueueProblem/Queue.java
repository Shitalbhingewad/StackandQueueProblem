package com.SatckQueueProblem;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Queue {
	private static final Logger logger = LogManager.getLogger(App.class);
	private static QueueNode rear = null, front = null;

	// insertion at the end
	public void enqueue(int item) {

		QueueNode node = new QueueNode(item);

		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}

	}

	public boolean isEmpty() {
		return rear == null && front == null;
	}

	// delete at the beginning
	public int dequeue() {
		if (front == null) {
			logger.info("\nQueue Underflow");
			System.exit(-1);
		}

		QueueNode temp = front;
		logger.info(temp.data);
		front = front.next;

		if (front == null) {
			rear = null;
		}
		return temp.data;
	}

}