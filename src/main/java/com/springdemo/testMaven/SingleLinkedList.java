package com.springdemo.testMaven;

class ListNode {
	int data;
	ListNode nextNode;

}

public class SingleLinkedList {

	private ListNode head;

	public void insert(int data) {

		ListNode newNode = new ListNode();
		newNode.data = data;
		newNode.nextNode = head;
		head = newNode;
	}
	
	public void delete()
	{
		head = head.nextNode;
	}
	
	public void printList()
	{
		System.out.println("Inside printlist --> Newly updated with ");
		ListNode current = head;
		while(current != null)
		{
			System.out.print(current.data +"-->");
			current = current.nextNode;
		}
		
		System.out.println("Null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList list = new SingleLinkedList();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);

        list.printList();
	}

}
