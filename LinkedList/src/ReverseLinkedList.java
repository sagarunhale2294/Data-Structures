public class ReverseLinkedList {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void push(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        newNode.next = null;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current!=null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.print();
        list.reverse();
        list.print();
    }
}
