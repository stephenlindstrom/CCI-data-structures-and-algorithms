import java.lang.Math;

class Main {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();

        LinkedList.Node a1 = new LinkedList.Node(3);
        LinkedList.Node a2 = new LinkedList.Node(7);
        LinkedList.Node a3 = new LinkedList.Node(5);
        LinkedList.Node i1 = new LinkedList.Node(9);
        LinkedList.Node i2 = new LinkedList.Node(4);
        LinkedList.Node i3 = new LinkedList.Node(2);
        LinkedList.Node b1 = new LinkedList.Node(6);
        LinkedList.Node b2 = new LinkedList.Node(3);
        
        l1.add(a1);
        l1.add(a2);
        l1.add(a3);
        l1.add(i1);
        l1.add(i2);


        l2.add(b1);
        l2.add(b2);
        l2.add(i1);

        LinkedList.Node inter = findIntersection(l1, l2);
        if (inter != null) {
            System.out.println("Intersection: " + inter.data);
        }
        else {
            System.out.println("No intersection");
        }
    }

    static LinkedList.Node findIntersection(LinkedList l1, LinkedList l2) {
        int diff = Math.abs(l1.length() - l2.length());
        LinkedList.Node n1 = l1.head;
        LinkedList.Node n2 = l2.head;
        LinkedList.Node intersection;
        if (l1.length() > l2.length()) {
            LinkedList.Node shiftedNode = shiftNode(n1, diff);
            intersection = compareNodes(shiftedNode, n2);
        }
        else if (l2.length() > l1.length()) {
            LinkedList.Node shiftedNode = shiftNode(n2, diff);
            intersection = compareNodes(shiftedNode, n1);
        }
        else {
            intersection = compareNodes(n1, n2);
        }
        return intersection;
    }

    static LinkedList.Node shiftNode(LinkedList.Node n, int shift) {
        for (int i=0; i<shift; i++) {
                n = n.next;
        }
        return n;
    }

    static LinkedList.Node compareNodes(LinkedList.Node n1, LinkedList.Node n2) {
        while (n1 != null && n2 != null) {
            if (n1 == n2) {
                return n1;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        return null;
    }
}
