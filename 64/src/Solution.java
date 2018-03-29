import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] res = {{1,3,1}, {1,5,1}, {4,2,1}};
        int k = solution.minPathSum(res);
        System.out.print(k);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] array = new int[m][n];

        array[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            array[i][0] = grid[i][0] + array[i - 1][0];
        }
        for (int j = 1; j < n; j ++) {
            array[0][j] = grid[0][j] + array[0][j - 1];
        }

        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                array[i][j] = grid[i][j] + (array[i - 1][j] < array[i][j - 1]?array[i - 1][j]:array[i][j - 1]);
            }
        }

        return array[m - 1][n - 1];
    }
}
