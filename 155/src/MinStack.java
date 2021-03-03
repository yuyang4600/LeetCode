import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MinStack {
    List<Integer> list = null;
    public MinStack() {
        list = new LinkedList();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        if (list.size() != 0) {
            return list.get(list.size() - 1);
        }

        return -1;
    }

    public int getMin() {
        int num = Integer.MAX_VALUE;
        for (Integer item : list) {
            if (item < num) {
                num = item;
            }
        }
        return num;
    }
}
