package com.pradeep.datastructures;

public class Stack {

	static int[] arr;
	static int top = -1;

	public Stack(int capacity) {
		arr = new int[capacity];
	}

	public void push(int ElementToPush) {

		if (top + 1 < arr.length) {
			arr[++top] = ElementToPush;
		} else {
			System.out.println("Stack Overflow!!");
		}

	}

	public int pop() {
		if (top == -1) {
			System.out.println("Stack Underflow!!");
			return -1;
		} else {
			return arr[top--];
		}
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Stack Underflow!!");
			return -1;
		} else {
			return arr[top];
		}
	}

	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		stack.push(6);

		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		
	}
}
