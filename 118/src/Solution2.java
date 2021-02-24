import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if (numRows == 0) {
            return list;
        }
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for (int i = 1; i < numRows; i ++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> preRow = list.get(i - 1);
            row.add(1);
            for (int j = 1;j < i; j ++) {
                row.add(preRow.get(j - 1) + preRow.get(j));
            }
            row.add(1);
            list.add(row);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.generate(4));
    }
}