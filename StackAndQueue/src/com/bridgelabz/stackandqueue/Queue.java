package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class Queue<K> {
	private final LinkedList<Integer> queueList;

	public Queue() {
		queueList = new LinkedList<>();
	}
	public void enqueue(Node element) {
		queueList.append(element);
	}
	
	
	public void printQueue() {
		queueList.printNodes();;
	}


}
