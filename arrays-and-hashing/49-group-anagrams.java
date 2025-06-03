class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> hm = new HashMap<>();
		// looping through every word
		for (String str : strs) {
			char chars[] = str.toCharArray();
			Arrays.sort(chars);
			// using sorted word as the key
			String key = new String(chars);
			hm.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
		}

		return new ArrayList<>(hm.values());
	}
}