import java.util.NoSuchElementException;

public class MinStack {
    private MinStackNode top;

    public class MinStackNode {
        private int data;
        private MinStackNode next;
        public int subStackMin;
        
        public MinStackNode(int data) {
            this.data = data;
        }
    }

    public void push(int data) {
        MinStackNode node = new MinStackNode(data);
        if (top == null) {
            top = node;
            top.subStackMin = top.data;
        } else {
            MinStackNode oldTop = top;
            top = node;
            if (top.data < oldTop.subStackMin) {
                top.subStackMin = top.data;
            } else{
                top.subStackMin = oldTop.subStackMin;
            }
            top.next = oldTop;
        }
    }

    public int pop() {
        if (top == null) throw new NoSuchElementException();
        MinStackNode oldTop = top;
        top = top.next;
        return oldTop.data;
    }
   
    public int getMin() {
        if (top == null) throw new NoSuchElementException();
        return top.subStackMin;
    }

}