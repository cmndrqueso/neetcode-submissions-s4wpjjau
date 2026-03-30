class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for(int num: nums){
          seen.add(num);
        }

        int longestSequence = 0;
        for(int num: seen) {
          // If currentNum -1 does not exist (start of sequence)
          if (!seen.contains(num - 1)) {
            int currSequence = 1;
            // while set contains next num
            int nextNum = num + 1;
            while(seen.contains(nextNum)){
              currSequence++;
              nextNum++;
            }
            longestSequence = Math.max(currSequence, longestSequence);
          }
          

        }
        return longestSequence;
    }
}
