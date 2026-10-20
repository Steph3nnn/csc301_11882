public class DeleteMiddle {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node deleteMiddle(Node head) {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count == 1)
            return null;

        int middle = count / 2;

        temp = head;

        for (int i = 1; i < middle; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " → ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        display(head);
        head = deleteMiddle(head);
        display(head);
    }
}