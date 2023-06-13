public class DeleteNodeFromLinkedList {
    class Node {
        int data;
        Node next;
        public Node (int data) {
            this.data = data;
        }
    }

    Node head;

    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
    }

    public void print() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void delete(int key) {
        if(head == null) {
            return;
        }
        if(head.data == key) {
            head = head.next;
            return;
        }
        Node prev = null;
        Node current = head;
        while (current!=null) {
            if(current.data == key) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }
    public static void main(String[] args) {
        DeleteNodeFromLinkedList list = new DeleteNodeFromLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.print();
        list.delete(4);
        list.print();
    }
}
