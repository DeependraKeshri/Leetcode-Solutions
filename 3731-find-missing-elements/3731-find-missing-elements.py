class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        minimum=min(nums)
        maximum=max(nums)
        l=[]
        for i in range(minimum, maximum):
            if i not in nums:
                l.append(i)
        return l