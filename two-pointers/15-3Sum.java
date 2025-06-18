class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int o = 0, length = nums.length - 2; o < length; o++) {
            if (o > 0 && nums[o] == nums[o - 1]) { continue; }

            int i = o + 1, j = nums.length - 1;

            while (i < j) {
                int sum = nums[o] + nums[i] + nums[j];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[o], nums[i], nums[j]));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) { i++; }
                } else if (sum > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}