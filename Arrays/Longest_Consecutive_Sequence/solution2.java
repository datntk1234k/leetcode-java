package Arrays.Longest_Consecutive_Sequence;

import java.util.HashSet;

public class solution2 {
    public int longestConsecutive(int[] nums) {
        // Hashset O(n)
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num: nums) {
            numsSet.add(num);
        }
        int best_length = 1;

        for (int num: numsSet) {
            if (!numsSet.contains(num - 1)) {
                int length = 1;
                while (numsSet.contains(num + length)) {
                    length++;
                } best_length = Math.max(length, best_length);
            }
        } return best_length;

    }
}
