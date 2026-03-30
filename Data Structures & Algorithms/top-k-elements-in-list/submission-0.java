class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Create array of most frequent
        int [] results = new int [k];
        // Map of <numberSeen, frequency>
        Map <Integer, Integer> seen = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];
        // Make an arraylist entry for every freq item
        for(int i = 0; i< freq.length; i++) {
          freq[i] = new ArrayList<>();
        }

        // Fill Seen count map
        for(int num: nums) {
          int newCount = seen.getOrDefault(num, 0) + 1;
          seen.put(num, newCount);
        }
        // Fill freq list
        // For each entry in map, in freq[index of value(count)] add(key)
        for(Map.Entry<Integer, Integer> entry : seen.entrySet()) {
          freq[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        // For each list in list of freqs reverse order
        for(int i = freq.length -1; i > 0 && index < k; i-- ) {
          // For each item in list 
          for (int n: freq[i]) {
            // Add number (n) from frequency to results
            results[index++] = n;
            // If results reached, return results, short circuit
            if (index == k) {
              return results;
            }
          }
        }
        // Return Results if for some reason this doesnt short circuit
        return results;
    }
}
