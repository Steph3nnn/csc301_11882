public class SimpleLinkedList {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next; // Just skip the first node
        }
    }

    public void deleteLast() {
        if (head == null) return;
        if (head.next == null) {
            head = null;
            return;
        }

        Node tail = head;
        while (tail.next.next != null) {
            tail = tail.next;
        }
        tail.next = null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.print("Starting list: ");
        list.printList();

        list.deleteFirst();
        System.out.print("After deleting from front: ");
        list.printList();

        list.deleteLast();
        System.out.print("After deleting from back: ");
        list.printList();
    }
}