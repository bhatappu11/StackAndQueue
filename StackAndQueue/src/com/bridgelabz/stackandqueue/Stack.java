package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class Stack<K> {
	private final LinkedList<Integer> stackList;

	public Stack() {
		stackList = new LinkedList<>();
	}
	
	public void push(Node data) {
		stackList.add(data);
	}
	
	public void printStack() {
		stackList.printNodes();
	}
	
}
