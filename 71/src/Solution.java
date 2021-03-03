import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "/../";
        System.out.println(solution.simplifyPath(str));
    }
    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        for (int i = 1; i < strs.length; i ++) {
            if (strs[i].equals("..")) {
                if (!arrayDeque.isEmpty()) {
                    arrayDeque.removeLast();
                } else {
                    continue;
                }
            } else if(strs[i].equals(".") || strs[i].equals("")) {
                continue;
            } else {
                arrayDeque.add("/" + strs[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (arrayDeque.isEmpty()) {
            arrayDeque.add("/");
        }
        while (!arrayDeque.isEmpty()) {
            String a = arrayDeque.poll();
            sb.append(a);
        }

        return sb.toString();
    }
}
