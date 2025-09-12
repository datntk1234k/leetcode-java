package product_of_array_except_self;

public class solution1 {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length();
        int[] ans = new int[n]; // array save output

        prefix = 1; // Dùng số 1 = đúng → vì “không có gì để nhân” nên lấy 1.
        for (int i = 0; i <= n; i++) {
            ans[i] = prefix;
            prefix *= nums[i]; 
        }
        postfix = 1; 
        for (int i = n -1; i >= 0; i--) {
            ans[i] = ans[i] * postfix;
            postfix *= nums[i]; 
        } return ans;
    }
}

 
