class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        list=[]
        for i in range(len(nums)):
            list.append(nums[nums[i]])
        return list