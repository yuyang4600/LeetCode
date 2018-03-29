public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateMatrix(6);
    }
    public int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        int i, j, num = 0;
        int num_f = 1;
        int tempN = n;
        while (n > 0) {
            array[num][num] = num_f;
            /*
            上面
             */
            for (i = num, j = num + 1; j < n + num; j ++) {
                array[i][j] = array[num][num] + j - num;
            }
            /*
            右面
             */
            for (j -= 1,i = 1 + num; i < n + num; i ++) {
                array[i][j] = array[i - 1][j] + 1;
            }
            /*
            下面
             */
            for (i -= 1, j -= 1; j >= num; j --) {
                array[i][j] = array[i][j + 1] + 1;
            }
            /*
            左面
             */
            for (j = num, i -= 1; i > num; i --) {
                array[i][j] = array[i + 1][j] + 1;
            }

            num_f += 4 * n - 4;
            num ++;
            n = n - 2;
        }
        return array;
    }

}
