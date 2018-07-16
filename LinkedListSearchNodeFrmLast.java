/**
 * For any details email to:sagarunhale2294@gmail.com
 */

/**
 * @author sagarunhale2294
 * Creating a Node for Linked List
 */
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

/**
 * Driver class to manipulate Linked list operations
 * @author sagarunhale2294
 */
public class LinkedListSearchNodeFrmLast {

	Node head;
	
	/**
	 * Method to seratch nth Node of Linked list from end of list
	 * @param position
	 */
	public void searchNode(int position){
		Node main_ptr=head;
		Node ref_ptr=head;
		int count=0;
		if(head!=null){
			while(count<position){
				if(ref_ptr==null){
					System.out.println("position of element is greater than list of elements");
					return;
				}
				ref_ptr=ref_ptr.next;
				count++;
			}
			
			while(ref_ptr!=null){
				main_ptr=main_ptr.next;
				ref_ptr=ref_ptr.next;
			}
			System.out.println("Element at "+position+"th position from end of List is "+main_ptr.data);
		}
	}
	
	/**
	 * Method to add nodes into Linked list
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
	 * Drivind method to perform operations on Linked list
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListSearchNodeFrmLast llist=new LinkedListSearchNodeFrmLast();
		llist.push(4);
		llist.push(6);
		llist.push(2);
		llist.push(7);
		llist.printList();
		llist.searchNode(3);
		llist.searchNode(4);
	}
}