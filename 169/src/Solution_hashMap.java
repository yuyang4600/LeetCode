import java.util.HashMap;
import java.util.Map;

public class Solution_hashMap {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums) {
            map.putIfAbsent(num, 1);
            if (map.get(num) != null) {
                map.put(num, map.get(num) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > nums.length/2) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] arr = {3,2,3};
        System.out.println(solution.majorityElement(arr));
    }
}
