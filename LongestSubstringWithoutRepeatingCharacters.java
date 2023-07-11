import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] charS = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        int maxLength = 0;

        while (end < s.length()) {
            Character current = charS[end];
            if(!set.contains(current)) {
                set.add(current);
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(charS[start]);
                start++;
            }
        }
        return maxLength;

    }
}
