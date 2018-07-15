/**
 * 
 */
package com.cts.search;

/**
 * @author Sagar Unhale
 * A Node of Linked list
 */
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
/**
 * Driver class for Linked list operation
 * @author Sagar Unhale
 *
 */
public class LinkedListSearchNode {

	Node head;
	
	/**
	 * Method to search given node
	 * @param element
	 * @return status
	 */
	public boolean searchNode(int element){
		Node temp=head;
		if(head==null){
			System.out.println("false");
		}
		while(temp!=null){
			if(temp.data==element)
				return true;
			temp=temp.next;
		}
		return false;
	}
	
	/**
	 * Method to add Nodes to Linked list
	 * @param data
	 */
	public void push(int data){
		if(head==null){
			head=new Node(data);
			return;
		}
		Node new_node=new Node(data);
		new_node.next=head;
		head=new_node;
	}
	
	/**
	 * Method to print Linked list elements
	 */
	public void printList(){
		Node tnode=head;
		while(tnode!=null){
			System.out.print(tnode.data+"  ");
			tnode=tnode.next;
		}
		System.out.println();
	}
	
	/**
	 * Driving Method to search a node from Linked list
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListSearchNode list=new LinkedListSearchNode();
		list.push(9);
		list.push(4);
		list.push(3);
		list.printList();
		System.out.println(list.searchNode(2));
		System.out.println(list.searchNode(4));
	}
}