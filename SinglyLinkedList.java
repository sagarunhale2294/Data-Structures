/**
 * For any details email to:sagarunhale2294@gmail.com
 */

/**
 * @author Sagar Unhale
 *
 */
class Node{
	
	int data;
	Node next;
	
	/**
	 * Creating a Node for Linked list
	 * @param data
	 */
	public Node(int data){
		this.data=data;
	}
}
public class SinglyLinkedList {

	Node head;
	
	/**
	 * Insert a Node at the front of List
	 * @param data
	 */
	public void push(int data){
		Node new_node=new Node(data);
		
		new_node.next=head;
		head=new_node;
	}
	
	/**
	 * Insert Node at specific location of List
	 * @param prev_node
	 * @param data
	 */
	public void insertAfterNode(Node prev_node,int data){
		Node new_node=new Node(data);
		if(prev_node==null){
			System.out.println("Previous Node cannot be null");
			return;
		}
		new_node.next=prev_node.next;
		prev_node.next=new_node;
	}
	
	/**
	 * Insert Node at the End of List
	 * @param data
	 */
	public void insertAtEnd(int data){
		Node new_node=new Node(data);
		if(head==null){
			head=new Node(data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=new_node;
	}
	
	/**
	 * Printing Linked List
	 */
	public void printList(){
		Node node=head;
		while(node!=null){
			System.out.print(node.data+"  ");
			node=node.next;
		}
	}
	/**
	 * This class test Linked List functionality
	 * @param args
	 */
	public static void main(String[] args) {
		SinglyLinkedList singlyLinkedList=new SinglyLinkedList();
		singlyLinkedList.push(7);
		singlyLinkedList.insertAtEnd(6);
		singlyLinkedList.insertAtEnd(8);
		singlyLinkedList.insertAfterNode(singlyLinkedList.head.next, 9);
		singlyLinkedList.printList();

	}

}
