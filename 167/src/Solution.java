class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        if (numbers.length == 0) {
            return new int[0];
        }
        for(int i = 0; i < numbers.length; i ++) {
            for (int j = i +1; j < numbers.length; j ++) {
                if (numbers[i] + numbers[j] == target) {
                    arr[0] = i + 1;
                    arr[1] = j + 1;

                    return arr;
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2,8,5,5};
        int[] res = solution.twoSum(arr, 9);
        if (res != null) {
            System.out.println(res[0] + "...." + res[1]);
        }else {
            System.out.println("null");
        }
    }
}