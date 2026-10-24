public class SumTwoLinkedLists {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public static int sumTwoLists(Node head1, Node head2) {
        int sum = 0;

        while (head1 != null) {
            sum += head1.data;
            head1 = head1.next;
        }


        while (head2 != null) {
            sum += head2.data;
            head2 = head2.next;
        }

        return sum;
    }

    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.next = new Node(20);
        list1.next.next = new Node(30);


        Node list2 = new Node(5);
        list2.next = new Node(15);
        list2.next.next = new Node(25);


        int result = sumTwoLists(list1, list2);

        System.out.println("Sum of both linked lists: " + result);
    }
}