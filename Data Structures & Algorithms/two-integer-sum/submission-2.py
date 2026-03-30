class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
      seen = {}
      i = 0
      numsSize = len(nums)
      
      if numsSize == 2:
        return [0,1]

      while i < numsSize:
        num = nums[i]
        difference = target - num
        if difference in seen:
            return [seen[difference],i]
        seen[num] = i
        i+=1
        
