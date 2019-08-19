public class Solution {
    public int majorityElement(int[] nums) {
        nums = QuickSort(nums, 0, nums.length - 1);
        int temp = 1;
        int result = 1;
        int majorityNum = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] == nums[i - 1]) {
                temp ++;
                if (temp > result) {
                    result = temp;
                    majorityNum = nums[i];
                }
            }else {
                temp = 1;
            }
        }

        return majorityNum;
    }

    public int[] QuickSort(int[] nums, int low, int high) {
        int i = 0, j = 0, temp, t;
        if (low > high) {
            return nums;
        }
        temp = nums[low];
        i = low;
        j = high;
        while(i < j) {
            while (nums[j] >= temp && i < j) {
                j--;
            }
            while (nums[i] <= temp && i < j) {
                i++;
            }
            if (i < j) {
                t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }

        nums[low] = nums[i];
        nums[i] = temp;
        QuickSort(nums, low, j - 1);
        QuickSort(nums, j + 1, high);

        return nums;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr = {1};
        System.out.println(solution.majorityElement(arr));
    }
}
