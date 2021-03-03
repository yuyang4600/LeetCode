import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution2 {
    public static void main(String[] args) {
        String s = " ";
        Solution2 solution = new Solution2();
        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0;
        int ans = 0;
        Set<Character> list = new HashSet<Character>();
        for (int i = 0; i < n; i ++) {
            if (i != 0) {
                list.remove(s.charAt(i - 1));
            }
            while (j < n && !list.contains(s.charAt(j))) {
                list.add(s.charAt(j));
                j ++;
            }
            ans = Math.max(list.size(), ans);
        }

        return ans;
    }
}
