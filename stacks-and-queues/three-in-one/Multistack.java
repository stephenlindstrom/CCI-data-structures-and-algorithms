import java.uti

public class Multistack {
    private int numberOfStacks;
    private int stackSize;
    private int[] values; 
    private int[] sizes;

    public Multistack(int numberOfStacks, int stackSize) {
        this.numberOfStacks = numberOfStacks;
        this.stackSize = stackSize;

        values = new int[numberOfStacks * stackSize];
        sizes = new int[numberOfStacks];
    }

    public void push(int stackNum, int data) {
        if isFull(stackNum) throw new FullStackException();
        sizes[stackNum]++;
        int topIndex = getTopIndex(stackNum);
        values[topIndex] = data;
    }

    public int pop(int stackNum) {
        if isEmpty(stackNum) throw new EmptyStackException();
        int topIndex = getTopIndex(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum) {
        if isEmpty(stackNum) throw new EmptyStackException();
        int topIndex = getTopIndex(stackNum);
        return values[topIndex];
    }

    public boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }

    public boolean isFull(int stackNum) {
        return sizes[stackNum] == stackSize;
    }

    public int getTopIndex(int stackNum) {
        int offset = stackNum * stackSize;
        int topIndex = offset + size[stackNum] - 1;
        return topIndex;
    }
}