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

    public int maxSubArray2(int[] nums) {
        // 分析遍历数组的情况。维持一个连续的数组元素和。
        // 如果该数组的和大于0,那么加上一个元素之后的值肯定大于这个元素的值。
        // 也就是说，从后一个元素开始的子数组和加上前面的数组会更大。
        // 但是，如果当前的数组和是负数，加上后肯定没有从后一个元素开始的子数组的和大。
        int max = nums[0];
        int sum = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }
            else{

                sum += nums[i];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {-2,1};
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray2(arr));
    }
}