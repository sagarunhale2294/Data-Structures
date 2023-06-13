/**
 * For any details email to: sagarunhale2294@gmail.com
 */

/**
 * Driver class which will implement all linked list manipulation
 * @author Sagar Unhale
 *
 */
public class LinkedListDeletion {

	/**
	 * Creating a Node to Insert into list
	 * @author Sagar Unhale
	 *
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
	 * Delete a specific Node from Linked list
	 * @param key
	 */
	public void deleteNode(int key){
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key){
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key){
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;
	}

	/**
	 * Inserting node into linked list
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
	 * Print all elements of Linked list
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
	 * Main method to call all methods of Linked list
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListDeletion list=new LinkedListDeletion();
		list.push(7);
		list.push(8);
		list.push(6);
		list.push(4);
		list.printList();
		list.deleteNode(6);
		list.printList();
	}
}
