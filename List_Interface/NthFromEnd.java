//Given a singly linked list (use LinkedList), find the Nth element from the end without calculating its size.

public class NthFromEnd {
    static class Node {
        String data;
        Node next;
        Node(String data) { this.data = data; }
    }

    public static String getNthFromEnd(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.data;
    }

    public static void main(String[] args) {

        Node head = new Node("A");
        head.next = new Node("B");
        head.next.next = new Node("C");
        head.next.next.next = new Node("D");
        head.next.next.next.next = new Node("E");

        String result = getNthFromEnd(head, 2);

        System.out.println(result);
    }
}
