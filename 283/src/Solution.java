import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] array = {0,0,1};
        solution.moveZeroes(array);

    }
    public void moveZeroes(int[] nums) {
        List list = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i ++) {
            list.add(nums[i]);
        }
        for (int i = 0; i < list.size(); i ++) {
            if (list.get(i).equals(0)) {
                list.remove(i);
                count += 1;
                i = i - 1;
            }
        }
        for (int i = 0; i < count; i ++) {
            list.add(0);
        }

        for (int i = 0; i < list.size(); i ++) {
            nums[i] = (int)list.get(i);
        }
        for (int i = 0; i < nums.length; i ++) {
            System.out.println(nums[i]);
        }
    }
}
