package com.SatckQueueProblem;
public class Queue {
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

}