public class LinkedListInsertion {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head;

    public void printList() {
        Node node = head;
        while(node!=null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public void addNode(int data) {
        if(head==null) {
            head = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next!=null) {
            last = last.next;
        }
        newNode.next = null;
        last.next = newNode;
    }

    public boolean searchNode(int key) {
        if (head == null)
            return false;
        Node temp = head;
        while (temp!=null) {
            if(temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean iterativeSearch(Node head, int key) {
        if (head == null)
            return false;

        if(head.data == key) {
            return true;
        }
        return iterativeSearch(head.next, key);
    }

    public static void main(String[] args) {
        LinkedListInsertion listInsertion = new LinkedListInsertion();
        listInsertion.push(1);
        listInsertion.push(4);
        listInsertion.push(6);
        listInsertion.push(7);
        listInsertion.printList();


        String response = (listInsertion.searchNode(6)) ? "Node found" : "Node not found!!!";
        System.out.println(response);


        String response1 = (listInsertion.iterativeSearch(listInsertion.head, 5)) ? "Node found" : "Node not found!!!";
        System.out.println(response1);
    }
}
