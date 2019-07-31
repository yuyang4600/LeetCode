class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max_sum = nums[0];
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i ++) {
            int sum = nums[i];
            for (int j = i + 1; j < nums.length; j ++) {
                sum = sum + nums[j];
                if (max_sum < sum) {
                    max_sum = sum;
                }
            }
            if (max_sum < sum) {
                max_sum = sum;
            }
        }
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] > max_sum) {
                max_sum = nums[i];
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(arr));
    }
}