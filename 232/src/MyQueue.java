import java.util.Stack;

public class MyQueue {
    Stack stack1 = null;
    Stack stack2 = null;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack();
        stack2 = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return (int)stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return (int)stack2.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        return stack2.empty();
    }
}
