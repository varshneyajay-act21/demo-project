package linkedListSamples;

public class LinkedList {
	private Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insert(int data) {
		Node node = new Node(data);
		if (head == null)
			head = node;
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next=node;

	}
}
