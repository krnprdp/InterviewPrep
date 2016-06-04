package amazonsolutions;

public class CirclularLinkedList {

	public static void main(String[] args) {
		int[] a = { 5, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		Node head;
		Node temp;
		head = new Node(a[0]);
		temp = head;
		for (int i = 1; i < a.length; i++) {
			temp.next = new Node(a[i]);
			temp = temp.next;
		}
		temp.next = head;
		Node res = insert(head, new Node(0));
		Node tmp = res;
		while (tmp.next != res) {
			System.out.print(tmp.value + " ");
			tmp = tmp.next;
		}
		System.out.print(tmp.value);
	}

	public static Node insert(Node head, Node element) {

		Node temp = head;

		// if list is empty
		if (head == null) {
			element.next = element;
			head = element;
			return head;
		}

		// if list has only 1 element
		if (head.next == null || head.next == head) {
			head.next = element;
			element.next = head;
			return head;
		}

		// if element is less than head
		if (element.value <= head.value) {
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = element;
			element.next = head;
			return head;
		}

		while (temp.next != head && temp.next.value < element.value) {
			temp = temp.next;
		}
		element.next = temp.next;
		temp.next = element;

		return head;
	}
}

class Node {
	public Node(int i) {
		value = i;
	}

	Node next;
	int value;
}
