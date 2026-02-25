class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        c=0
        for i in nums:
            if i%3==1:
                c+=1
            elif i%3==2:
                c+=1
            else:
                continue
        return c