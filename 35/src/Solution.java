class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == target) {
                return i;
            }else if (nums[i] > target) {
                return i;
            }
        }

        return nums.length;
    }

    //二分法
    public int searchInsert2(int[] nums, int target) {
        int n = 0, r = nums.length - 1;
        while (n <= r) {
            int m = n + (r-n) / 2;
            if (nums[m] == target) return m;
            if (nums[m] < target) n = m+1;
            else r = m-1;
        }
        return n;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,3,5,6};
        System.out.println(solution.searchInsert2(arr, 7));
    }
}
