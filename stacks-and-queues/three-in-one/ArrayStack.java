import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayStack {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void add(int data) {
        list.add(data);
    }

    public int remove() {
        if (list.isEmpty()) throw new NoSuchElementException();
        int lastIndex = list.size() - 1;
        int data = list.get(lastIndex);
        list.remove(lastIndex);
        return data;
    }

    public int peek() {
        if (list.isEmpty()) throw new NoSuchElementException();
        int lastIndex = list.size() - 1;
        return list.get(lastIndex);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}