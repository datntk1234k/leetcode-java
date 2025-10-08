package two_pointers.two_sum_II_array;

public class solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0; 
        int r = numbers.length -1; 
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[] {l + 1, r + 1};
            } 
        } 
        return new int[] {-1, -1};
    }
}
