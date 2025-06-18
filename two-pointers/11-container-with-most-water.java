class Solution {
    public int maxArea(int[] height) {
        
        int result = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int area = (r - l) * Math.min(height[l], height[r]);
            result = Math.max(area, result);
            if (height[l] > height[r])
                r--;
            else
                l++;
        }

        return result;
    }
}