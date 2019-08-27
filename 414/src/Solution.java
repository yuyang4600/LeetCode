import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {
        if (nums == null) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        for (int i = nums.length - 1; i > 0; i --) {
            if (nums[i - 1] != nums[i]) {
                count ++;
            }
            if (count == 3) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }

    public int thirdMax2(int[] nums) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE, status = 7;
        for(int i = 0; i < nums.length; i ++){
            if((nums[i] == max && (status & 4) == 0)  ||( nums[i]== second  && (status & 2) == 0)||( nums[i] == third && (status & 1) == 0)){
                continue;
            }
            status = status >> 1;
            if(nums[i] > max){
                third = second;
                second = max;
                max = nums[i];
            }
            else if(nums[i] > second){
                third = second;
                second = nums[i];
            }
            else if(nums[i] > third){
                third = nums[i];
            }
        }
        if((status&7) != 0){
            return max;
        }
        else{
            return third;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,2,3,1};
        System.out.println(solution.thirdMax2(arr));
    }
}
