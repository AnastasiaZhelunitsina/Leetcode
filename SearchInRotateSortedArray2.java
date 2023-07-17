import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchInRotateSortedArray2 {
    public boolean search(int[] nums, int target) {
        List<Integer> numsList = IntStream.of(nums).boxed().collect(Collectors.toList());
        if(numsList.contains(target)){
            return true;
        } else {
            return false;
        }

    }
}
