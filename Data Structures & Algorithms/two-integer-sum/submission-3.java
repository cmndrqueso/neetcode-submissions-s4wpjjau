
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int numsSize = nums.length;
        // Short circuit if array is only two nums. 
        // Based on the assumption that the array MUST == target
        if (numsSize == 2) {
          int[] answer = {0,1};
          return answer;
        }
        // Otherwise
        // Hasmap < Number in array as key, index as value>
        HashMap<Integer,Integer> seen = new HashMap<>();
        for (int i = 0; i < numsSize; i++) {
          int num = nums[i];
          Integer exists = seen.get(target - num);
          if (exists != null) {
            int[] answer = {exists, i};
            return answer;
          } 
          seen.put(num,i);
        }
        return null;
    }
}
