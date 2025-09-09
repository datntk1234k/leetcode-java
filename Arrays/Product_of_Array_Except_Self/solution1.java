package product_of_array_except_self;

public class solution1 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length();
        int[] ans = new int[n];  

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            ans = prefix;
            prefix *= nums[i];
        }
    }
}
