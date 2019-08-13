public class Solution2 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for (int i = 0; i < prices.length; i ++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }else if (prices[i] - minPrice > maxPrice) {
                maxPrice = prices[i] - minPrice;
            }
        }

        return maxPrice;
    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] arr = {7,1,5,3,6,4};
        System.out.println(solution.maxProfit(arr));
    }
}