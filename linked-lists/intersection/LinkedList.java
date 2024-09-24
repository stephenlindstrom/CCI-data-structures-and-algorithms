public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node (int d) {
            data = d;
        }
    }

    Node add(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = n;
        }
        return head;
    }

    void printList() {
        Node n = head;
        while(n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

    int length() {
        int count = 0;
        Node n = head;
        while(n != null) {
            count++;
            n = n.next;
        }
        return count;
    }
}