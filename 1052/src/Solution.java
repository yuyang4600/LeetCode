public class Solution {
    public static void main(String[] args) {
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy =    {0,1,0,1,0,1,0,1};
        int X = 3;

        Solution solution = new Solution();
        int maxSatisfied = solution.maxSatisfied(customers, grumpy, X);
        System.out.println(maxSatisfied);
    }
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int a = 0;
        int preCount = 0;
        int midCount = 0;

        for (int i = 0; i < X; i ++) {
            midCount = midCount + customers[i];
        }
        int lastCount = 0;

        int res = 0;

        int last = X;
        while (last < grumpy.length) {
            if (grumpy[last] == 0) {
                lastCount = lastCount + customers[last];
            }
            last ++;
        }

        for (int i = 0; i < grumpy.length - X + 1; i ++) {
            int j = i + X;
            if (i > 0) {
                if (grumpy[a] == 0) {
                    preCount = customers[a] + preCount;
                }
                a ++;

                midCount = midCount + customers[j - 1] - customers[i - 1];
            }
            if ( j > X) {
                if (grumpy[j - 1] == 0) {
                    lastCount = lastCount - customers[j - 1];
                }
            }

            if (res < preCount + midCount + lastCount) {
                res = preCount + midCount + lastCount;
            }
        }
        return res;
    }

}
