import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int right = 0,left = 0;
        if (nums.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i ++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                right ++;
            }else {
                return true;
            }
            if (right - left > k) {
                set.remove(nums[left]);
                left ++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {1,0,1,1};
        int k = 1;
        System.out.println(solution.containsNearbyDuplicate(arr, k));
    }
}
