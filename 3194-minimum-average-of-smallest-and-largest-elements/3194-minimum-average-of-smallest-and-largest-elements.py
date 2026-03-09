class Solution:
    def minimumAverage(self, nums: List[int]) -> float:
        nums.sort()
        s,e=0,len(nums)-1
        ans=1000
        while(s<e):
            val=(nums[s]+nums[e])/2
            if val<ans:
                ans=val
            s+=1
            e-=1
        return ans