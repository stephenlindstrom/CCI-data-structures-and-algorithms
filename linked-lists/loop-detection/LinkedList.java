public class LinkedList {
    Node head;

    public void add(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = n;
        }
    }
}