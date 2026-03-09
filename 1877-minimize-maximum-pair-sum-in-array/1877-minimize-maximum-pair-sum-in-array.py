class Solution:
    def minPairSum(self, nums: List[int]) -> int:
        nums.sort()
        s,e=0,len(nums)-1
        max=0
        while(s<e):
            if(nums[s]+nums[e]>max):
                max=nums[s]+nums[e]
            s+=1
            e-=1
        return max