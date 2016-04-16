package ctc.LinkedLists;

import java.util.HashSet;
import java.util.Hashtable;

import com.pradeep.datastructures.LinkedList;
import com.pradeep.datastructures.LinkedList.Node;

/*
 * Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP:
 * How would you solve this problem if a temporary buffer is not allowed?
 */

public class RemoveDupplicates {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		list.addFirst(3);
		list.addFirst(4);
		list.addFirst(5);

		Node<Integer> node = list.head();
		while (node != null) {
			System.out.println(node.getElement());
			node = node.getNext();
		}
		removeDuplicates(list);

		node = list.head();
		while (node != null) {
			System.out.println(node.getElement());
			node = node.getNext();
		}
	}

	public static void removeDuplicates(LinkedList<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>();

		Node<Integer> node = list.head();
		while (node != null) {

			if (set.contains(node.getElement())) {
				// duplicate found
				node.setNext(node.getNext());
			} else {
				set.add(node.getElement());
				node = node.getNext();
			}
			node = node.getNext();
		}

	}
}
