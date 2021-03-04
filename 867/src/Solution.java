public class Solution {
    public static void main(String[] args) {
        int[][] a = {{}};
        Solution solution = new Solution();
        solution.transpose(a);
    }

    public int[][] transpose(int[][] matrix) {
        int row = matrix[0].length;
        int line = matrix.length;
        int[][] newArr = new int[row][line];

        for (int i = 0; i < matrix[0].length; i ++) {
            for (int j = 0; j < matrix.length; j ++) {
                newArr[i][j] = matrix[j][i];
            }
        }
        return newArr;
    }
}
