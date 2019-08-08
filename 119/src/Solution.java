import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex + 1;
        List<List<Integer>> list = new ArrayList<>();
        if (rowIndex == 0) {
            return new ArrayList<>();
        }
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for (int i = 1; i < rowIndex; i ++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = list.get(i - 1);
            row.add(1);
            for (int j = 1;j < i; j ++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.getRow(3));
    }
}
