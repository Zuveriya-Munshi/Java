class Node {
    int info;
    Node next;
    Node prev;
    Node head;
	Node(){
	
        next = null;
        prev = null;
	head = null;
}

    public Node(int info) {
        this.info = info;
        next = null;
        prev = null;
	head = null;
    }



    public void insert(int info) {
        Node newNode = new Node(info);

        if (head == null) {
            head = newNode;
        } else if (info < head.info) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.info < info) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class exam_dll {
    public static void main(String[] args) {
        Node list = new Node();

        list.insert(5);
        list.insert(3);
        list.insert(4);
        list.insert(1);
        list.insert(2);

        System.out.print("Doubly Linked List:");
        list.traverse();
    }
}
