/**
 * 
 */

/**
 * Driver Class which manipulate Linked List operatons
 * @author Sagar Unhale
 */
public class LinkedListDeletionByPos {

	/**
	 * Creating a Node For a Linked List
	 * @author Sagar Unhale
	 */
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}

	Node head;
	
	/**
	 * Method to delete a node from Linked List
	 * @param position
	 */
	public void deleteNode(int position){
		Node temp=head;
		if(head==null){
			return;
		}
		if(position==0){
			head=temp.next;
			return;
		}
		int i=0;
		while(temp!=null && i<position-1){
			temp=temp.next;
			i++;
		}
		if(temp==null || temp.next==null){
			return;
		}
		temp.next=temp.next.next;
	}
	
	/**
	 * Method to add Node to Linked list
	 * @param data
	 */
	public void push(int data){
		Node new_node=new Node(data);
		if(head==null){
			head=new Node(data);
			return;
		}
		new_node.next=head;
		head=new_node;
	}
	
	/**
	 * method to Print Linked list
	 */
	public void printList(){
		Node tnode=head;
		while(tnode!=null){
			System.out.print(tnode.data+"  ");
			tnode=tnode.next;
		}
		System.out.println("");
	}
	/**
	 * Driving method to delete node from Linked list
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListDeletionByPos llist=new LinkedListDeletionByPos();
		llist.push(2);
		llist.push(4);
		llist.push(6);
		llist.push(7);
		llist.printList();
		llist.deleteNode(3);
		llist.printList();

	}

}
