class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lst=[]
        for i in range(0,len(nums)):
            sum=nums[i]
            for j in range(i+1,len(nums)):
                if sum+nums[j]==target:
                    lst.append(i)
                    lst.append(j)
                    return lst