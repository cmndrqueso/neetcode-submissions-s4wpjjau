class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int [] results = new int[size];
        
        int i = 0;
        while (i < size) {
          int leftHalf = 1;
          int rightHalf = 1;
          // Left half
          if (i > 0) {
            for (int leftPointer = 0; leftPointer < i; leftPointer++ ){
              leftHalf = leftHalf * nums[leftPointer];
            }
          }
          // Right Half
          if (i < size){
            for (int rightPointer = i + 1; rightPointer < size; rightPointer++) {
              rightHalf = rightHalf * nums[rightPointer];
            }
          }
          results[i] = leftHalf*rightHalf;
          i++;
        }
        return results;
    }
}  
