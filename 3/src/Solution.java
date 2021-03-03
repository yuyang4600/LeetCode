public class Solution {
    public static void main(String[] args) {
        String s = "";
        Solution solution = new Solution();
        int i = solution.lengthOfLongestSubstring(s);
        System.out.println(i);
    }
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder("");
        int num = 0;
        int j = 0;
        for (int i = 0; i < s.length();) {
            while (j < s.length() && !sb.toString().contains(String .valueOf(s.charAt(j)))) {
                sb.append(s.charAt(j));
                j ++;
            }
            if (sb.length() > num) {
               num = sb.length();
            }
            sb = new StringBuilder("");
            i ++;
            j = i;

        }
        if (sb.length() > num) {
            num = sb.length();
        }

        return num;
    }
}