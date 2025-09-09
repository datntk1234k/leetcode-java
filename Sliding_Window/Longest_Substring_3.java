package Sliding-window;

import java.util.HashSet;
import java.util.Set;

public class longest3 {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0; 
        Set<Character> set = new HashSet<>();
        for (r = 0; r < s.length(); r++) {
            char c = s.charAt(r); 
            while (set.contains(c)) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(c);
            max = Math.max(max, r - l + 1);
        }
        return max;

    } 
}
