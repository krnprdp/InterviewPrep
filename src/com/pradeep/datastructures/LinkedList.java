package com.pradeep.datastructures;

public class LinkedList<E> {

	// Node class
	private static class Node<E> {

		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> next) {
			this.next = next;
		}

	}

	// Linkedlist class

	private Node<E> head;
	private Node<E> tail;
	private int size;

	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public E first() {
		if (isEmpty())
			return null;
		else
			return head.getElement();
	}

	public E last() {
		if (isEmpty())
			return null;
		else
			return tail.getElement();
	}

	public void addFirst(E e) {
		Node<E> node = new Node<E>(e, null);
		if (isEmpty()) {
			head = node;
			tail = head;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}

	public void addLast(E e) {
		Node<E> node = new Node<E>(e, null);
		if (isEmpty()) {
			head = node;
			tail = head;
		} else {
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public E removeFirst() {
		if (isEmpty())
			return null;

		E element = head.getElement();
		head = head.next;
		size--;
		if (isEmpty())
			tail = null;
		return element;

	}
}
