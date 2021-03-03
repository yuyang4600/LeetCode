import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Deque<Integer> deque1 = null;
    Deque<Integer> deque2 = null;
    /** Initialize your data structure here. */
    public MyStack() {
        deque1 = new LinkedList();
        deque2 = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        while (!deque1.isEmpty()) {
            deque2.add(deque1.poll());
        }
        deque1.add(x);
        while (!deque2.isEmpty()) {
            deque1.add(deque2.poll());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque1.poll();
    }

    /** Get the top element. */
    public int top() {
        if (deque1.size() != 0) {
            return deque1.peek();
        }

        return  0;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque1.isEmpty();
    }

}
