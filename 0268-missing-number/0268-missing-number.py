class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        xor=0
        for i in range(len(nums)+1):
            xor^=i
        for i in nums:
            xor^=i
        return xor