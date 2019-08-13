public class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        for (int i = 0;i < prices.length; i ++) {
            for (int j = i + 1; j < prices.length; j ++) {
                if (prices[j] - prices[i] > maxPrice) {
                    maxPrice = prices[j] - prices[i];
                }
            }
        }

        return maxPrice;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(arr));
    }
}
