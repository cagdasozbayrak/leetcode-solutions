public class MedianOfTwoSortedArrays {
    public int[] merge(int[] a1, int[] a2) {
        int i = 0, j = 0;
        int l1 = a1.length;
        int l2 = a2.length;

        int[] merged = new int[l1 + l2];

        int n = 0;

        while (i < l1 && j < l2) {
            if (a1[i] <= a2[j]) {
                merged[n++] = a1[i++];
            } else {
                merged[n++] = a2[j++];
            }
        }

        while (i < l1) {
            merged[n++] = a1[i++];
        }

        while (j < l2) {
            merged[n++] = a2[j++];
        }

        return merged;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] merged = merge(nums1, nums2);
        int n = merged.length;

        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n / 2] + merged[n / 2 - 1]) / 2d;
        }
    }
}
