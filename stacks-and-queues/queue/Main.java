public class Main {
    public static void main (String[] args) {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        int removeNum = queue.remove();
        int peekNum = queue.peek();
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println(removeNum);
        System.out.println(peekNum);
        System.out.println(queue.isEmpty());
    }
}