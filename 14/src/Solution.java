public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {};
        System.out.println(solution.longestCommonPrefix(strs));
    }
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        String str = strs[0];
        int i = 0;
        for (i = 0; i < str.length();) {
            if (isSame(strs, str.substring(0, i + 1))) {
                i ++;
            } else {
                return str.substring(0, i);
            }
        }
        return str.substring(0, i);
    }
    public boolean isSame(String[] strs, String start) {
        for (int i = 1; i < strs.length; i ++) {
            if (!strs[i].startsWith(start)) {
                return  false;
            }
        }
        return true;
    }
}
