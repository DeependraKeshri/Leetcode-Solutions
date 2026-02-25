class Solution:
    def getSneakyNumbers(self, nums: List[int]) -> List[int]:
        l=[]
        for i in nums:
            if nums.count(i)>1 and i not in l:
                l.append(i)
        return l