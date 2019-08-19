public class Solution3 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (right > 0 && numbers[right] > target - numbers[left]) {
            right --;
        }
        while (left < right) {
            if (target == numbers[left] + numbers[right]) {
                break;
            }if (target > numbers[left] + numbers[right]) {
                left ++;
            }else {
                right --;
            }
        }
        res[0] = left + 1;
        res[1] = right + 1;

        return res;
    }
}
