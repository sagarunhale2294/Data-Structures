public class SplitCircularLinkedList {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    static Node head, head1, head2;

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

    public void print(Node head) {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if(temp==head) {
                System.out.println("There is loop");
                break;
            }
        }
        System.out.println();
    }
    public void splitCircularList() {
        Node fast_ptr = head;
        Node slow_ptr = head;
        Node prev = head;
        while (fast_ptr.next!=head && fast_ptr.next.next!=head) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        head1 = head;
        head2 = slow_ptr.next;
        slow_ptr.next = head1;
        fast_ptr.next = head2;
    }
    public static void main(String[] args) {
        SplitCircularLinkedList list = new SplitCircularLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.head.next.next.next.next.next = list.head;

        list.print(head);
        list.splitCircularList();
        list.print(head1);
        list.print(head2);
    }
}
