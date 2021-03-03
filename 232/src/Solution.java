import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        System.out.println(obj.pop());
        obj.push(5);
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
    }



}
