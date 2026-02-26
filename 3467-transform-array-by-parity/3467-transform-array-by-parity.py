class Solution:
    def transformArray(self, nums: List[int]) -> List[int]:
        even=0
        odd=0
        for i in nums:
            if i%2==0:
                even+=1
            else:
                odd+=1
        for i in range(len(nums)):
            if even!=0:
                nums[i]=0
                even-=1
            else:
                nums[i]=1
                odd-=1
        return nums