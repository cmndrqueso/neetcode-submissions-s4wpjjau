class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int[] result = {0, 0}; 
        if (length == 2) {
            return new int[]{0,1};
        }
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < length; i++) {
            int diff = target - nums[i];
            if (seen.containsKey(diff)) {
                result[0] = seen.get(diff);
                result[1] = i;
                return result;
            }
            seen.put(nums[i], i);
        }
        return result;
    }
}
