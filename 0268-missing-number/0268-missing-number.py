class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        s=sum(range(1,len(nums)+1))
        return s-sum(nums)