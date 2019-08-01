public class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length - j; i ++) {
            if (nums[i] == val) {
                j ++;
                nums[i] = nums[nums.length - j];
                i --;
            }
        }
        return nums.length - j;
    }

    public int removeElement1(int[] nums, int val) {
        int count = 0;
        int final_num = 0;
        for (int i = 0; i < nums.length - count; i ++) {
            if (nums[i] == val) {
                count ++;
                nums[i] = nums[nums.length - count];
                nums[nums.length-count] = val;
                i --;
            }
            final_num = nums.length - count;
        }

        return final_num;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,2,4,2,3,5,6};
        System.out.println("kk");
        System.out.println(solution.removeElement1(arr, 3));
    }
}
