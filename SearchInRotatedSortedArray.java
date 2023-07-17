import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        List<Integer> numsList = IntStream.of(nums).boxed().collect(Collectors.toList());

        if(numsList.contains(target)){
            return numsList.indexOf(target);
        } else {
            return -1;
        }
    }
}
