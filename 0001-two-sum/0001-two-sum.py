class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        l=[]
        for i in range(len(nums)):
            val=target-nums[i]
            if val in d:
                l.append(i)
                l.append(d[val])
                return l
            d[nums[i]]=i
        return l