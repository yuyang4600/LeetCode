public class Solution {
    public int removeDuplicates(int[] nums) {
        int number = 0;
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1;
        return number;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,5,6,7,8,9};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(arr));
    }
}
