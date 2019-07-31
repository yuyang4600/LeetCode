public class Solution2 {
    public int removeElement(int[] nums, int val) {
        int i = 0,j = 0;
        int temp = 0;
        while(j < nums.length) {
            if (nums[i] != nums[j]) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if (j <= i || nums[j] ==val) {
                j ++;
            }
            if (nums[i] != val) {
                i ++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {3,3,3,2,4,2,3,5,6};
        System.out.println(solution.removeElement(arr, 3));
    }
}
