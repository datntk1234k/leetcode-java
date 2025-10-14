package two_pointers

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class solution2 { // Two Pointers
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++ ) {
            if (nums[i] > 0 ) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Duplicate

            int l = i + 1; int r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    r--;
                    l++;
                    while (l < r && nums[l] == nums[r]) {
                        l++;
                    }
                }
            }
        } return res;
    }
}
// Time Complexity = O(n²) 
// Space Complexity = O(1)