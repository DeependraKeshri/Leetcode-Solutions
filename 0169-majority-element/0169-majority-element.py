class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        n=(int)(len(nums)/2)
        nums.sort()
        return nums[n]