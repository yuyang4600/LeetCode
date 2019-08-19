public class Solution2 {
    public int majorityElement(int[] nums) {
        int maxCount = nums.length/2;
        for (int num : nums) {
            int count = 0;
            for (int element : nums) {
                if (num == element) {
                    count ++;
                }
            }
            if (count > maxCount) {
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {1};
        System.out.println(solution.majorityElement(arr));
    }
}
