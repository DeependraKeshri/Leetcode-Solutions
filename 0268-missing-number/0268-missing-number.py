class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        s=(int)((n/2)*(n+1))
        return s-sum(nums)