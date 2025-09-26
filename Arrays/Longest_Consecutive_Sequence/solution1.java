package Arrays.Longest_Consecutive_Sequence;

import java.lang.reflect.Array;
import java.util.Arrays;

// Sort O(n log n)
public class solution1 {
    public int longestConsecutive(int[] nums) {
        // Step 1
        if (nums.length == 0) return 0;
        // Step 2
        Arrays.sort(nums);
        // Step 3 
        int best = 1;
        int curlen = 1;
        // Step 4 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            else if (nums[i] == nums[i - 1] + 1) {
                curlen++;
            }
            else {
                best = Math.max(best, curlen);
                curlen = 1;
            } 
        }
        best = Math.max(curlen, best);
        return best;

    }
    
}
