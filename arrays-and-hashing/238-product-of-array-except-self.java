class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length, prod = 1;
        int[] result = new int[n];
        // prefix product
        result[0] = prod;
        for (int i = 1; i < n; i++) {
            prod *= nums[i-1];
            result[i] = prod;
        }

        // suffix product
        prod = 1;
        result[n-1] *= prod;
        for (int i = n-2; i > -1; i--){
            prod *= nums[i+1];
            result[i] *= prod;
        }

        return result;
    }
}