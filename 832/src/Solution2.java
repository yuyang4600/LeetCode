public class Solution2 {
    public static void main(String[] args) {
        int[][] A = {{1,1,0},{1,0,1},{0,0,0}};
        Solution2 solution = new Solution2();
        solution.flipAndInvertImage(A);
    }
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0;i < A.length; i ++) {
            int left = 0;
            int right = A[0].length - 1;
            while (left < right) {
                if(A[i][left] == A[i][right]) {
                    A[i][left] = A[i][left] ^ 1;
                    A[i][right] = A[i][right] ^ 1;
                }
                left ++;
                right --;
            }
            if (left == right) {
                A[i][right] = A[i][right] ^ 1;
            }
        }
        return  A;
    }
}
