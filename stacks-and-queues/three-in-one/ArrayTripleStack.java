import java.lang.ArrayIndexOutOfBoundsException;
public class ArrayTripleStack {
    int[] tripleStack = new int[100];

    public class StackOne {
        int count = 0;
        
        public void add(int data) {
            if (count <33) {
                tripleStack[count] = data;
                count++;    
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }

        public int peek() {
            return tripleStack[count-1];
        }
    }
}