import java.util.Arrays;
import java.util.List;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int count = nums.length;
        for (int i = 0; i < nums.length; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                if (nums[i] == nums[j]) {
                    count --;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,2,2,2,2,3,3,3,2,2,2,2,2,4,4,4};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(arr));
    }
}
