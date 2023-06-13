public class FindNthNodeFromLast {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

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

    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int findNthNodeFromLast(int place) {
        Node main_ptr = head;
        Node ref_ptr = head;
        if(place <= 0) {
            System.out.println("Invalid input!!!");
            System.exit(0);
        }
        int count =1;
        while(count <= place) {
            ref_ptr = ref_ptr.next;
            count++;
        }
        while(ref_ptr!=null) {
            ref_ptr = ref_ptr.next;
            main_ptr = main_ptr.next;
        }
        return main_ptr.data;
    }

    public int findMiddleNode() {
        Node first = head;
        Node second = head;
        while(second.next!=null && second.next.next!=null) {
            first = first.next;
            second = second.next.next;
        }
        return first.data;
    }

    public static void main(String[] args) {
        FindNthNodeFromLast list = new FindNthNodeFromLast();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);

        list.print();
        System.out.println("Nth Node from last is: " + list.findNthNodeFromLast(1));
        System.out.println("Middle Node is: " + list.findMiddleNode());
    }
}
