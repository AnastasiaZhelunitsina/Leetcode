import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        int count = 0;
        int end = Integer.MIN_VALUE;

        for (int[] interval : intervals) {
            if (interval[0] >= end) {
                end = interval[1];
            } else {
                count++;
                end = Math.min(end, interval[1]);
            }
        }

        return count;
    }
}
