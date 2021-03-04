import java.util.ArrayDeque;
import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        int[] ints = {5,2,9,7,4};
        Solution2 solution = new Solution2();
        int[] ints1 = solution.nextGreaterElements(ints);
        System.out.println(ints1);

    }
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        int[] res = new int[len];
        for (int i = 0; i < len * 2 - 1; i ++) {
            while (!arrayDeque.isEmpty() && nums[arrayDeque.peekLast()] < nums[i % nums.length]) {
                arrayDeque.removeLast();
            }

            res[i & nums.length] = arrayDeque.isEmpty()? -1: nums[arrayDeque.getLast()];

            arrayDeque.addLast(i % len);
        }
        return nums;
    }

}
