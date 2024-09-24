import java.util.NoSuchElementException;
public class MyQueue {
    private static class QueueNode {
        private int data;
        private QueueNode next;

        public QueueNode (int data) {
            this.data = data;
        }
    }

    private QueueNode first;
    private QueueNode last;

    public void add (int data) {
        QueueNode node = new QueueNode(data);
        if (first == null) {
            first = node;
            last = node;
        }
        last.next = node;
        last = node;
    }

    public int remove () {
        if (first == null) throw new NoSuchElementException();
        int d = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return d;
    }

    public int peek () {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    } 

    public boolean isEmpty() {
        return first == null;
    }
}