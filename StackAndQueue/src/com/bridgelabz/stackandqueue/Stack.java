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
	
	public int peek() {
		return stackList.getHead().getKey();
	}
	
	public void pop() {
		stackList.pop();
	}
	public boolean isEmpty() {
		if(stackList.getHead() != null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public int size() {
		return stackList.size();
	}
	
	

}
