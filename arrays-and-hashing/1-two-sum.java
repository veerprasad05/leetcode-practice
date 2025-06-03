class Solution {
	public int[] twoSum(int[] nums, int target) {
		int size = nums.length, arr[] = new int[2];
		HashMap<Integer, Integer> hash_map = new HashMap<>();
		Integer temp;
		for(int i = 0; i < size; i++) {
			if ((temp = hash_map.get(target - nums[i])) != null) {
				arr[0] = temp;
				arr[1] = i;
				return arr;
			}
			else {
				hash_map.put(nums[i], i);
			}
		}
		return arr;
	}
}