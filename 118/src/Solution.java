import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list_tmp = new ArrayList<>();
        List<Integer> list_1 = new ArrayList<>();
        list_1.add(1);
        List<Integer> list_2 = new ArrayList<>();
        list_2.add(1);
        list_2.add(1);
        if (numRows == 1) {
            list_tmp.add(list_1);
            return list_tmp;
        }
        if (numRows == 2) {
            list_tmp.add(list_1);
            list_tmp.add(list_2);
            return list_tmp;
        }
        list_tmp.add(list_1);
        list_tmp.add(list_2);

        list_tmp = generate(--numRows);
        list_2 = list_tmp.get(list_tmp.size() - 1);

        for (int m = 0; m < list_2.size() - 1; m ++) {
            list_1.add(list_2.get(m) + list_2.get(m + 1));
        }
        list_1.add(1);
        list_tmp.add(list_1);
        return list_tmp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }
}
