import javax.xml.transform.SourceLocator;

public class Solution {
    public static void main(String[] args) {
        int[] ints = {1};
        Solution solution = new Solution();
        int[] ints1 = solution.nextGreaterElements(ints);
        System.out.println(ints1);
    }
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int i = 0;

        while (i < len) {
            int j = i + 1;
            while (j != i) {
                if (j == len) {
                    j = 0;
                    if ( j == i) {
                        res[i] = -1;
                        break;
                    }
                }
                if (nums[j] > nums[i]) {
                    res[i] = nums[j];
                    break;
                }
                res[i] = -1;
                j ++;
            }
            i ++;
        }
        return res;
    }
}
