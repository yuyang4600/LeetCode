import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution2 {
    public static void main(String[] args) {
        String str = "K4(ON(SO3)2)2";
        Solution2 solution = new Solution2();
        String s = solution.countOfAtoms(str);
        System.out.println(s);

    }
    int i = 0;
    public String countOfAtoms(String formula) {
        Map<String, Integer> map = parse(formula);
        StringBuilder sb = new StringBuilder();
        for (String key : map.keySet()) {
            String name = key;
            sb.append(name);
            int mulitplicity = map.get(name);
            if (mulitplicity > 1) {
                sb.append(mulitplicity);
            }
        }
        return sb.toString();
    }

    private Map<String, Integer> parse(String formula) {
        int length = formula.length();
        Map<String, Integer> map = new TreeMap<>();
        while (i < length && formula.charAt(i) != ')') {
            if(formula.charAt(i) == '(') {
                i ++;
                for (Map.Entry<String, Integer> entrys : parse(formula).entrySet()) {
                    map.put(entrys.getKey(), map.getOrDefault(entrys.getKey(), 0) + entrys.getValue());
                }
            }
            else {
                int istart = i ++;
                while (i < length && Character.isLowerCase(formula.charAt(i))) {
                    i ++;
                }
                String name = formula.substring(istart, i);
                istart = i;
                while (i < length && Character.isDigit(formula.charAt(i))) {
                    i ++;
                }
                int multiplicity = istart < i ? Integer.valueOf(formula.substring(istart, i)) : 1;
                map.put(name, map.getOrDefault(name, 0) + multiplicity);
            }
        }
        int istart = ++i ;
        while (i < length && Character.isDigit(formula.charAt(i))) {
            i ++;
        }
        if (istart < i) {
            int mulitplicity = Integer.valueOf(formula.substring(istart, i));
            for (String key : map.keySet()) {
                map.put(key, map.get(key) * mulitplicity);
            }
        }
        return map;

    }

}
