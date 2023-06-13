public class RemoveDuplicatesFromList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node head;

    public void push(int data) {
        if(head==null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void removeDuplicates() {
        Node current = head;
        while (current!=null) {
            Node  temp = current;
            while(temp != null && temp.data == current.data) {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromList list = new RemoveDuplicatesFromList();
        list.push(11);
        list.push(11);
        list.push(11);
        list.push(21);
        list.push(21);
        list.push(32);
        list.removeDuplicates();
        list.print();
    }
}
