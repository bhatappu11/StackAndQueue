package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class QueueMain {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(new Node<Integer>(56));
		queue.enqueue(new Node<Integer>(30));
		queue.enqueue(new Node<Integer>(70));
		queue.printQueue();
		queue.dequeue();
		System.out.println("After dequeue");
		queue.printQueue();
		
	}

}
