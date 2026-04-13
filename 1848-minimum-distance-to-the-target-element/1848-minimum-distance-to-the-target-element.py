class Solution:
    def getMinDistance(self, nums: List[int], target: int, start: int) -> int:
        ans=100000
        for i in range(len(nums)):
            if nums[i]==target:
                val=abs(start-i)
                if(val<ans):
                    ans=val
        return ans