public class IntersectionLinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head;

    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public static void print(Node head) {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node findIntersectionOfList(Node head1, Node head2) {
        Node temp = new Node(0);
        Node newHead = temp;
        while(head1!=null && head2!=null) {
            if (head1.data == head2.data) {
                temp.next = new Node(head1.data);
                temp = temp.next;
            }
            if(head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        IntersectionLinkedList list = new IntersectionLinkedList();
        list.push(1);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(7);

        list.print(list.head);

        IntersectionLinkedList list2 = new IntersectionLinkedList();
        list2.push(2);
        list2.push(3);
        // list2.push(4);
        list2.push(5);

        list2.print(list2.head);

        Node newListHead = IntersectionLinkedList.findIntersectionOfList(list.head, list2.head);
        System.out.println("Intersection of Linked list:");
        IntersectionLinkedList.print(newListHead);
    }
}
