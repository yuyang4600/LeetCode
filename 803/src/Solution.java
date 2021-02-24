import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        String str = "abcdddeeeeaabbbcd";
        Solution solution = new Solution();

        System.out.println(solution.largeGroupPositions(str));
    }
    public List<List<Integer>> largeGroupPositions(String s) {
        int i = 0;
        int j = 1;
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();

        char[] charArr = s.toCharArray();
        for (;j < s.length(); j ++) {
            if (charArr[i] == charArr[j]) {
                count ++;
            }else {
                if (count >= 2) {
                    List<Integer> countList = new ArrayList<>();
                    countList.add(i);
                    countList.add(j - 1);
                    list.add(countList);
                }
                i = j;
                count = 0;
            }
        }
        if (count >= 2) {
            List<Integer> countList = new ArrayList<>();
            countList.add(i);
            countList.add(j - 1);
            list.add(countList);
        }
        return list;
    }
}
