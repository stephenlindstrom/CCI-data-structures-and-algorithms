public class Main {
    public static void main(String[] args) {
        MyStack numStack = new MyStack();
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        int num = numStack.pop();
        int num2 = numStack.peek();
        System.out.println(num + " " + num2);
    }
}