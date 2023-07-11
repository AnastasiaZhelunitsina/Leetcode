import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            if (numsMap.containsKey(expect)) {
                result[0] = numsMap.get(expect);
                result[1] = i;
            } else {
                numsMap.put(nums[i], i);
            }
        }
        return result;
    }
}
