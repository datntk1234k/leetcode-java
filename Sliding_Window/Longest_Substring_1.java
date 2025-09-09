package lettcode;

import java.util.HashSet;
import java.util.Set;

public class longest1 {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (allUnique(s, i, j)) {
                    maxLen = Math.max(maxLen, j - i);
                }
            }
        }
        return maxLen;
    }

    private boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            if (!set.add(s.charAt(i))) return false;
        } return true;

    }
}


