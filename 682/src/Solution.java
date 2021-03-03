import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {


        ArrayDeque<Integer> arrayDeque = new ArrayDeque();
        arrayDeque.add(1);
        arrayDeque.add(2);
        arrayDeque.add(3);
        arrayDeque.addFirst(4);
        arrayDeque.addLast(5);
        Integer first = arrayDeque.getFirst();
        Integer last = arrayDeque.getLast();
        arrayDeque.offer(2);
        arrayDeque.offerFirst(3);
        arrayDeque.offerLast(4);
        arrayDeque.peek();
        arrayDeque.peekFirst();
        arrayDeque.push(6);
        arrayDeque.remove();
        arrayDeque.removeFirst();

        String[] strs = {"1"};
        Solution solution = new Solution();
        System.out.println(solution.calPoints(strs));
    }
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < ops.length; i ++) {
            switch (ops[i]) {
                case "C":
                    ans  = ans - Integer.valueOf(list.get(list.size() - 1));
                    list.remove(list.size() - 1);
                    break;
                case "+":
                    ans = ans + (list.get(list.size() - 1) + list.get(list.size() - 2));
                    list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
                    break;
                case "D":
                    ans = ans + list.get(list.size() - 1) * 2;
                    list.add(list.get(list.size() - 1) * 2);
                    break;
                default:
                    list.add(Integer.valueOf(ops[i]));
                    ans = ans + Integer.valueOf(ops[i]);
            }
        }
        return ans;
    }
}
