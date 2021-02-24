import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String str = "((()))";
        Solution solution = new Solution();
        boolean valid = solution.isValid(str);
        System.out.println(valid);
    }
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 != 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Deque<Character> queue = new LinkedList<>();
        for (int i = 0; i < s.length(); i ++) {
            if (map.containsKey(s.charAt(i))) {
                if (queue.isEmpty() || !map.get(s.charAt(i)).equals(queue.peek())) {
                    return false;
                } else {
                    queue.pop();
                }
            } else {
                queue.push(s.charAt(i));
            }
        }
        return queue.isEmpty();
    }
}
