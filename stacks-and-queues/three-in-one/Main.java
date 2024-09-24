public class Main {
    public static void main(String[] args) {
        Multistack stack = new Multistack(3, 25);
        stack.push(0, 5);
        stack.push(0, 6);
        stack.push(0, 7);
        stack.push(2, 5);

        System.out.println(stack.peek(0));
        System.out.println(stack.peek(2));
    }
}