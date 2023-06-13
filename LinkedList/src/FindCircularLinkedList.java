public class FindCircularLinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void push(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while(temp.next!=null) {
            temp=temp.next;
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

    public boolean isCircular(Node head) {
      if (head == null)
          return false;
      Node temp = head.next;
      while(temp!=null && temp!=head) {
          temp = temp.next;
      }
      return temp == head;
    }

    public boolean isCircularAnotherApproach(Node head) {
        if (head == null)
            return true;
        Node slow = head;
        Node fast = head.next;
        while (fast.next!=null && fast.next.next!=null) {
            if(fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    public static void main(String[] args) {
        FindCircularLinkedList list = new FindCircularLinkedList();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        System.out.print(list.isCircular(head) ? "Yes\n" : "No\n");

        // Making linked list circular
        head.next.next.next.next = head;

        System.out.print(list.isCircular(head) ? "Yes\n" : "No\n");
        System.out.println(list.isCircularAnotherApproach(head) ? "Yes\n" : "No\n");
    }
}
