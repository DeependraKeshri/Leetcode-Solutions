class Solution:
    def minElement(self, nums: List[int]) -> int:
        mini=max(nums)
        for i in nums:
            val=0
            while i>0:
                val+=(i%10)
                i=int(i/10)
            if val<mini:
                mini=val
        return mini