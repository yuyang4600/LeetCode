import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {5,5,5,2,9,9,9,9,7,4,4,4,4,4};
        Solution solution = new Solution();
        int[] ints1 = solution.nextGreaterElements2(ints);
        System.out.println();
    }

    public int[] MyNextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i < len * 2 - 1; i ++) {
            int j = i % len;
            while (!arrayDeque.isEmpty() && nums[j] > nums[arrayDeque.peekLast()]) {
                arrayDeque.removeLast();
            }
            res[j] = arrayDeque.isEmpty() ? -1:nums[arrayDeque.getLast()];

            arrayDeque.add(j);
        }

        return res;
    }

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; --i) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i % nums.length]) {
                stack.pop();
            }
            res[i % nums.length] = stack.empty() ? -1 : nums[stack.peek()];
            stack.push(i % nums.length);
        }
        return res;
    }

    public int[] nextGreaterElements2(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = len * 2 - 1; i >= 0; i --) {
            int item = i % len;
            while (!stack.isEmpty() && stack.getLast() <= nums[item]) {
                stack.removeLast();
            }

            res[item] = stack.isEmpty() ? -1 : stack.getLast();

            stack.add(nums[item]);
        }
        return res;
    }

}
