class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        // in hashmap storing it as num : freq
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        // store in a heap as count : number
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (Map.Entry<Integer, Integer> hmEntry : hm.entrySet()) {
            int[] pqEntry = {hmEntry.getKey(), hmEntry.getValue()};
            pq.offer(pqEntry);
            if(pq.size() > k) {
                pq.poll();
            }
        }

        // return array with k elements
        int[] retArr = new int[k];
        for (int i = 0; i < k; i++) {
            retArr[i] = pq.poll()[0];
        }
        return retArr;
    }
}