import java.util.EmptyStackException;

public class MyStack<Integer> {
    private static class StackNode<Integer> {
        private int data;
        private StackNode<Integer> next;

        public StackNode (int data) {
            this.data = data;
        }
    }

    private StackNode<Integer> top;

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int item = top.data;
        top = top.next;
        return item;
    }

    public void push(int item) {
        StackNode<Integer> t = new StackNode<Integer>(item);
        t.next = top;
        top = t;
    }

    public int peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}