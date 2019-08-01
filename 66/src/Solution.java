public class Solution {
    public int[] plusOne(int[] digits) {
        int count = 0;
        for (int i = 0; i < digits.length; i ++) {
            if (digits[i] != 9) {
                count ++;
            }
        }
        if (count > 0) {
            for (int j = digits.length - 1; j >= 0;) {
                digits[j] ++;
                if (digits[j] > 9) {
                    digits[j] = 0;
                    j --;
                }else {
                    break;
                }
            }
        }else {
            digits = new int[digits.length +1];
            digits[0] = 1;
            for (int i = 1; i < digits.length; i ++) {
                digits[i] = 0;
            }
        }

        return digits;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {9,9,9};
        int[] res = solution.plusOne(arr);
        for (int i = 0;i < res.length; i ++) {
            System.out.print(res[i]);
        }
    }
}
