public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0; j < n; j ++) {
            nums1[m] = nums2[j];
            m ++;
        }
        int temp = 0;
        for (int i = 0; i < nums1.length; i ++) {
            for (int j = i + 1; j < nums1.length; j ++) {
                if (nums1[i] > nums1[j]) {
                    temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i > 0 && j > 0) {
            if (nums1[i] < nums2[j]) {
                nums1[k --] = nums2[j --];
            }else {
                nums1[k --] = nums1[i --];
            }
        }

        while (j > 0) {
            nums1[k --] = nums2[j --];
        }
    }
}
