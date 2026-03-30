class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
          // All remaining nums are positive
          if (nums[i] > 0) break;
          // If number and previous number are duplicate, skip
          if (i > 0 && nums[i] == nums[i - 1]) continue;

          // Left pointer next to index start
          int l = i + 1;
          // Right pointer starts at end of nums
          int r = nums.length - 1;

          // While pointers do not meet
          while(l < r) {
            // add up curr index + left + right pointers
            int sum = nums[i] + nums[l] + nums[r];
            // if the sum is greater than 0, reduce right pointer (nums sorted)
            if(sum > 0) {
              r--;
            } else if (sum < 0) { // if sum is less than 0, bump up left pointer
              l++;
            } else {
              results.add(Arrays.asList(nums[i], nums[l], nums[r]));
              l++;
              r--;
              while(l < r && nums[l] == nums[l - 1]) {
                l++;
              }
            }
          }

        }
        return results;
    }
}
