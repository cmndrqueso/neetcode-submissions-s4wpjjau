class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        uniqueSet = set(nums)
        if len(nums) == len(uniqueSet):
            return False
        return True
