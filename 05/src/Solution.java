public class Solution {
    public static void main(String[] args) {

        String str = "asdfasdf";
        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        String result = "";
        for (int m = 0; m < len; m ++) {
            for (int i = 0; i + m < len; i ++) {
                int j = i + m;
                if (m == 0) {
                    dp[i][j] = true;
                }else if (m == 1) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                }else {
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                if (dp[i][j] && s.substring(i, i + m + 1).length() > result.length()) {
                    result = s.substring(i, i + m + 1);
                }
            }
        }
        return result;
    }


}
