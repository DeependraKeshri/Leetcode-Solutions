class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        import numpy as np
        
        n = len(nums)
        ar = np.arange(n + 1)
        
        st = set(nums)
        st1 = set(ar)
        
        num =int((st1.symmetric_difference(st)).pop())
        return num
