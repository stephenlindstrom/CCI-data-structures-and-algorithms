public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node n1 = new Node(3);
        Node n2 = new Node(4);
        Node n3 = new Node(5);
        Node n4 = new Node(6);
        Node n5 = new Node(7);
        
        list.add(n1);
        list.add(n2);
        list.add(n3);
        list.add(n4);
        list.add(n5);

        int loopLength = findLoopLength(n1);
        System.out.println(loopLength);
        Node loopStart = findLoopStart(list.head, loopLength);
        if (loopStart != null) {
            System.out.println(loopStart.data);
        } else {
            System.out.println("No loop");
        }
        
    }

    static int findLoopLength(Node head) {
        Node j = head;
        Node k = head.next;

        while (k != null) {
            if (j == k) {
                Node n = j;
                int count = 1;
                while (n.next != j) {
                    count++;
                    n = n.next;
                }
                return count;
            }
            j = j.next;
            if (k.next == null) {
                return 0;
            }
            k = k.next.next;
        }
        return 0;
    }

    static Node findLoopStart(Node head, int loopLength) {
        if (loopLength < 1) {
            return null;
        }
        Node j = head;
        Node k = head;
        for (int i=0; i<loopLength; i++) {
            k = k.next;
        }

        while (k != null) {
            if (j == k) {
                return j;
            }
            j = j.next;
            k = k.next;
        }
        return null;
    }


    // static Node findLoop(Node head) {
    //     Node n = head.next;
    //     while (n != null) {
    //         if (n == head) {
    //             return n;
    //         }
    //         n = n.next;
    //     }
    //     return null;
    // }
}