public class Solution2 {
                public int[] twoSum(int[] numbers, int target) {
                    int[] res = new int[2];
                    for (int i = 0; i < numbers.length; i ++) {
                        int diff = target - numbers[i];
                        int diff_index = binary_search(numbers, diff, i);
                        if (diff_index != -1) {
                            res[0] = i + 1;
                            res[1] = diff_index + 1;
                            break;
                        }
        }
        return res;
    }

    public int binary_search(int [] numbers, int target, int left) {
        int right = numbers.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (numbers[mid] > target) {
                right = mid - 1;
            }else if(numbers[mid] < target) {
                left = mid + 1;
            }else if(numbers[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {1,2,3,4,4,9,56,90};
        solution.twoSum(arr, 8);
    }
}
