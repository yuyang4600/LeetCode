public class Solution {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(6);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();

        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
