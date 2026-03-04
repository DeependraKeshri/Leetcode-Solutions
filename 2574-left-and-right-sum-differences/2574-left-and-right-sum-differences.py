class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        totSum=sum(nums)
        lt=0
        for i in range(len(nums)):
            val=nums[i]
            totSum-=nums[i]
            nums[i]=abs(totSum-lt)
            lt+=val
        return nums