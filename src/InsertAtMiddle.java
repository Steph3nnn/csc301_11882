public class InsertAtMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static void insertMiddle(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node slow = head;
        Node fast = head;
        Node previous = null;

        while (fast != null && fast.next != null) {
            previous = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        newNode.next = slow;
        previous.next = newNode;
    }

    public static void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " → ");
            current = current.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before insertion:");
        display();

        insertMiddle(25);

        System.out.println("After insertion:");
        display();
    }
}