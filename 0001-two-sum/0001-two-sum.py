class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        l=[]
        for i in range(len(nums)):
            val=target-nums[i]
            if val in nums and nums.index(val)!=i:
                l.append(i)
                l.append(nums.index(val))
                return l
        return l