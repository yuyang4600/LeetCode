public class Solution_force {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i ++) {
            for (int j = i + 1; j <= s.length(); j ++) {
                String test = s.substring(i, j);
                if(isPalindromic(test)) {
                    if(test.length() > maxLen) {
                        ans = test;
                        maxLen = test.length();
                    }
                }
            }
        }
        return ans;
    }

    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = sb.reverse();
        if (s.equals(sb1.toString())) {
            return true;
        } else {
            return false;
        }

    }
}
