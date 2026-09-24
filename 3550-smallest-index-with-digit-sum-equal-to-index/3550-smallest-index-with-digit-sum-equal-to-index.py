class Solution:
    def smallestIndex(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            val=nums[i]
            sum=0
            while(val>0):
                sum+=int(val%10)
                val/=10
            if(sum==i):
                return i
        return -1