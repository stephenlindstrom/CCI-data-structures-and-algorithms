import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SetOfStacks {
    private int stackCapacity;
    Stack currentStack;
    public ArrayList<Stack> stacks = new ArrayList<Stack>(); 

    public SetOfStacks (int stackCapacity) {
        this.stackCapacity = stackCapacity;
        this.currentStack = new Stack();
    }

    public class Stack {
        StackNode top;
        int size;

        public Stack() {
            stacks.add(this);
        }

        public static class StackNode {
            int data;
            StackNode next;

            public StackNode(int data) {
                this.data = data;
            }
        }
    }

    public void push(int data) {
        if (currentStack.top == null) {
            Stack.StackNode node = new Stack.StackNode(data);
            currentStack.top = node;
            currentStack.size = 1;
        }
        else if (currentStack.size == stackCapacity) {
            Stack.StackNode node = new Stack.StackNode(data);
            Stack newStack = new Stack();
            newStack.top = node;
            newStack.top.next = currentStack.top;
            currentStack = newStack;
            currentStack.size = 1;
        } else {
            Stack.StackNode node = new Stack.StackNode(data);
            Stack.StackNode oldTop = currentStack.top;
            currentStack.top = node;
            currentStack.top.next= oldTop;
            currentStack.size++;
        }
    }

    public int pop() {
        Stack.StackNode oldTop = currentStack.top;
        currentStack.top = currentStack.top.next;
        return oldTop.data;
    }

    public int popAt(int index) {
        Stack stack = stacks.get(index);
        if (stack.size == 0) throw new NoSuchElementException();
        Stack.StackNode oldTop = stack.top;
        stack.top = stack.top.next;
        stack.size--;
        return oldTop.data;
    }
}