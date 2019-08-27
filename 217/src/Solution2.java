import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 ||nums.length == 1) {
            return false;
        }
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i ++) {
            Integer value = map.get(nums[i]);
            if (value == null) {
                map.put(nums[i], 1);
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {1,2,3,4};
        System.out.println(solution.containsDuplicate(arr));
    }
}
