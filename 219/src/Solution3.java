import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i ++) {
            if (map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {};
        int k = 3;
        System.out.println(solution.containsNearbyDuplicate(arr, k));
    }
}
