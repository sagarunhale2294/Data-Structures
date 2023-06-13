public class DetectLoopInLinkedList {

    /**
     * Detect loop in a linked list using Floyd’s Cycle-Finding Algorithm
     */
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    static int count  = 0;

    public void push(int data) {
        if(head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }

    public boolean isLoopPresent() {
        Node fast_ptr = head;
        Node slow_ptr = head;
        while (fast_ptr!=null && fast_ptr.next!=null && slow_ptr!=null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
            count ++;
            if (fast_ptr == slow_ptr) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        Node compare = head;
        Node temp = head.next;
        while(temp != null) {
            if(compare == temp) {
                break;
            }
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DetectLoopInLinkedList list = new DetectLoopInLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.head.next.next.next.next = list.head;
        // list.print();
        System.out.println("Loop Present:"+ list.isLoopPresent());
        System.out.println("Count of Node in loop: " + count);
    }
}
