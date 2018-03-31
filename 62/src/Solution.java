public class Solution {
    static int count = 0;
    public static void main(String[] args) {
        Solution solution = new Solution();
        count = solution.uniquePaths(7, 3);
        System.out.print(count);
    }
    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (i == 0||j ==0) {
                    array[i][j] = 1;
                }else{
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
            }
        }
        return array[m-1][n-1];
    }
}


