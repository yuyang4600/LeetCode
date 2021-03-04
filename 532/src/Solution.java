import java.util.*;

public class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i ++) {
            if (list1.contains(nums[i])) {
                continue;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j ++) {
                if (list.contains(nums[j]) || list1.contains(nums[j])) {
                    continue;
                }
                if (Math.abs(nums[j] - nums[i]) == k) {
                    list.add(nums[j]);
                    count ++;
                }
            }
            list1.add(nums[i]);
        }
        return count;
    }

    public int findPairs2(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            if(i >= 1) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            for (int j = i + 1; j < nums.length; j ++ ){
                if (nums[j] - nums[i] == k) {
                    count ++;
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,1,4,1,5};
        System.out.println(solution.findPairs2(arr, 2));
    }
}
