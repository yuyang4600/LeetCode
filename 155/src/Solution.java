public class Solution {
    public static void main(String[] args) {
         MinStack obj = new MinStack();
         obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}
