public class Solution {
    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        Solution solution = new Solution();
        solution.flipAndInvertImage(A);

    }
    public int[][] flipAndInvertImage(int[][] A) {
        int [][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i ++) {
            for (int j = A[0].length - 1, m = 0; j >= 0; j --, m ++) {
                res[i][m] = (A[i][j] == 0 ? 1 : 0);
            }
        }
        return res;
    }
}
