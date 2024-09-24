public class Main{
    public static void main(String[] args) {
        SetOfStacks stackSet = new SetOfStacks(3);
        stackSet.push(1);
        stackSet.push(2);
        stackSet.push(3);
        stackSet.push(4);
        stackSet.push(5);
        stackSet.push(6);
        stackSet.push(7);
        stackSet.push(8);
        System.out.println(stackSet.popAt(1));
        System.out.println(stackSet.popAt(1));
        System.out.println(stackSet.popAt(1));
        System.out.println(stackSet.popAt(1));
    }
}