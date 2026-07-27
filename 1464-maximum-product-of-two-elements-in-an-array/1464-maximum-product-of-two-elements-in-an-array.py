class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        n1=max(nums)
        idx=nums.index(n1)
        n2=-1000
        for i in range(len(nums)):
            if nums[i]>n2 and i!=idx:
                n2=nums[i]
        return (n1-1)*(n2-1)