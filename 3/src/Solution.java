public class Solution {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (int i = 0, j = 0; i < s.length(); i ++) {
            if (!sb.toString().contains(String .valueOf(s.charAt(j)))) {
                j ++;
            } else {
                if (sb.length() > num) {
                    num = sb.length();
                    sb = null;
                }
                i = j;
            }
        }

        return num;
    }
}
