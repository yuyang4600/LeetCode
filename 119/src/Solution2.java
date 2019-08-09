import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0) {
            return list;
        }
        list.add(1);
        if (rowIndex == 1) {
            return list;
        }

        for (int i = 2; i <= rowIndex; i ++) {
            list.add(1);
            for (int j = i - 1; j > 0; --j) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }

        return list;
    }
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.getRow(3));
    }
}
