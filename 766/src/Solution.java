public class Solution {
    public static void main(String[] args) {
        int[][] ints = {{1,2,1},{5,1,2},{9,5,1}, {3,9,2}};
        Solution solution = new Solution();
        boolean toeplitzMatrix = solution.isToeplitzMatrix(ints);
        System.out.println(toeplitzMatrix);
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0;i < matrix[0].length - 1; i ++) {
            int m = 0;
            int n = i;
            while (n < matrix[0].length - 1 && m < matrix.length - 1) {
                if (matrix[m][n] != matrix[++m][++n]) {
                    return false;
                }
            }
        }
        for (int j = 0; j < matrix.length - 1; j ++) {
            int m = j;
            int n = 0;
            while (n < matrix[0].length - 1 && m < matrix.length - 1) {
                if (matrix[m][n] != matrix[++m][++n]) {
                    return false;
                }
            }
        }
        return true;
    }
}
