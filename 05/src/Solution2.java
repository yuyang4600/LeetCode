public class Solution2 {
    int begin = 0;
    int end = 0;

    public String longestPalindrome(String s) {
        if (s.length() < 1) {
            return "";
        }
        for (int i = 0;i < s.length(); i ++) {
            int len1 = length(s, i, i);
            int len2 = length(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - begin) {
                begin = i - (len - 1)/2;
                end = i + len/2;
            }
        }
        return s.substring(begin, end + 1);
    }

    public int length(String s, int start, int last) {
        while (start >= 0 && last < s.length() && (s.charAt(start) == s.charAt(last))) {
            --start;
            ++last;
        }
        return last - start - 1;
    }
}
