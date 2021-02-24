public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] res = new int[arr1.length];
        int m = 0;
        for (int j = 0; j < arr2.length; j ++) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[j]) {
                    res[m ++] = arr1[i];
                }else if ()
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr2 = {2,1,4,3,9,6};
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};

        solution.relativeSortArray(arr1, arr2);
    }
}