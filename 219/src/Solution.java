public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        while (i < nums.length) {
            int j = nums.length - 1;
            while (j > i) {
                if (nums[j] == nums[i] && j - i <= k){
                    return true;
                }
                j --;
            }
            i ++;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,0,1,1};
        int k = 1;
        System.out.println(solution.containsNearbyDuplicate(arr, k));
    }
}
