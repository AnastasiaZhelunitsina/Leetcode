import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length+ nums2.length];
        System.arraycopy(nums1, 0, mergedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, mergedArray, nums1.length, nums2.length);
        Arrays.sort(mergedArray);

        int median = mergedArray.length / 2;
        if (mergedArray.length % 2 == 0) {
            return (double) (mergedArray[median] + mergedArray[median - 1]) / 2;
        } else {
            return mergedArray[median];
        }


    }
}
