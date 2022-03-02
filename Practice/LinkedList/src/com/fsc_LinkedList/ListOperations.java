package com.fsc_LinkedList;

public class ListOperations {
	Node head;
	public void insert(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if(head == null) {
			head = node;
		}else {
			Node val = head;
			while(val.next != null) {
				val = val.next;
			}
			val.next = node;	
		}
	}
	public void show() {
		Node val = head;
		while(val.next != null) {
			System.out.println(val.data);
			val = val.next;
		}
		System.out.println(val.data);
	}
	
	

}
