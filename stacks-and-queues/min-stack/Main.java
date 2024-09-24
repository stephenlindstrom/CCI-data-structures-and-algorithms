public class Main {
    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(0);
        int data = stack.getMin();
        System.out.println(data);  
        stack.pop();
        int data2 = stack.getMin();
        System.out.println(data2);
    }
}