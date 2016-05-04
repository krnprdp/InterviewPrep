package com.pradeep.datastructures;

public class Queue {

	private int[] arr;			// Array for holding the Queue elements
	private int front;			// Front of queue
	private int size;			// Number of elements at any given time
	
	public Queue(int capacity){
		arr = new int[capacity];
	}
	
	public void EnQueue(int element){
		if (size == arr.length) throw new IllegalStateException("Queue is full!!");
		int availability = (front + size) % arr.length;
		arr[availability] = element;
		size++;
	}
	
	public int DeQueue(){
		
	}
	
	
}
