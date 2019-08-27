import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            if (nums[0] != 0) {
                return nums[0] - 1;
            }
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i + 1] - nums[i] > 1) {
                return nums[i] + 1;
            }
        }
        if (nums[0] != 0) {
            return nums[0] - 1;
        }else
            return nums[nums.length - 1] + 1;
    }

    public int missingNumber2(int[] nums) {
        int sum_num = 0;
        int min_num = Integer.MAX_VALUE;
        int max_num = Integer.MIN_VALUE;
        for (int item : nums) {
            sum_num = sum_num + item;
            if (item < min_num) {
                min_num = item;
            }
            if (item > max_num) {
                max_num = item;
            }
        }
        int sum = min_num * (nums.length + 1) + (nums.length + 1) * nums.length / 2;
        if (sum - sum_num > max_num && min_num != 0) {
            return min_num - 1;
        }else
            return sum - sum_num;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,4};
        System.out.println(solution.missingNumber2(arr));
    }
}
