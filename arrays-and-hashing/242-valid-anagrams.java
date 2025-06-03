class Solution {
	public boolean isAnagram(String s, String t) {

		// different length
		if (t.length() != s.length())
			return false;
		
		// equal length
		int counts[] = new int[26];
		for (char c : s.toCharArray())
			counts[c - 'a']++;

		for (char c : t.toCharArray())
			counts[c - 'a']--;

		for (int i : counts)
			if (i != 0)
				return false;

		return true;
	}
}