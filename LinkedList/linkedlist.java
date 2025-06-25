class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class linkedlist {

    Node head = null;

    // Add new node at the end
    public void add(int i) {
        Node newNode = new Node(i);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Print all node values
    public void printValues() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Delete the first node with given value
    public void delete(int data) {
        // Case 1: Empty list
        if (head == null) return;

        // Case 2: Head node needs to be deleted
        if (head.data == data) {
            head = head.next;
            return;
        }

        // Case 3: Traverse and delete
        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        linkedlist list = new linkedlist();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Original Linked List:");
        list.printValues();

        list.addFirst(5);
        System.out.println("After adding 5 at beginning:");
        list.printValues();

        list.delete(10);
        System.out.println("After deleting 10:");
        list.printValues();

        list.delete(5);
        System.out.println("After deleting 5 (head):");
        list.printValues();

        list.delete(100); // value not present
        System.out.println("After trying to delete 100 (not present):");
        list.printValues();
    }
}
