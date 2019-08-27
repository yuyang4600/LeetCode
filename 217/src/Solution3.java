import java.util.HashSet;
import java.util.Set;

public class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<Integer>(nums.length);
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }else {
                set.add(i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {1};
        System.out.println(solution.containsDuplicate(arr));
    }
}
