public class DoublyLinkedList {
    class Node {
        int data;
        Node next, prev;
        public Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }

    Node head;
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = null;
            newNode.prev = null;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        Node prev = temp;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            prev = temp;
            temp = temp.next;
        }
//        temp = prev;
//        System.out.println();
//        while (temp!=null) {
//            System.out.print(temp.data + " ");
//            temp = temp.prev;
//        }
        System.out.println();
    }

    public void reverse() {
        Node current = head;
        Node temp = null;
        while(current!=null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public void deleteNode(Node del) {
        if(del == head) {
            head = del.next;
        }
        if(del.next!=null) {
            del.next.prev = del.prev;
        }
        if(del.prev!=null) {
            del.prev.next = del.next;
        }
        return;
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

        list.printList();
        //list.reverse();
        list.deleteNode(list.head.next.next.next);
        list.printList();
    }
}
