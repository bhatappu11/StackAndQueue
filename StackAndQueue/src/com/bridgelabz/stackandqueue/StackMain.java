package com.bridgelabz.stackandqueue;

import com.bridgelabz.linkedlist.*;

public class StackMain {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(new Node<Integer>(70));
		stack.push(new Node<Integer>(30));
		stack.push(new Node<Integer>(56));
		stack.printStack();
	}

}
