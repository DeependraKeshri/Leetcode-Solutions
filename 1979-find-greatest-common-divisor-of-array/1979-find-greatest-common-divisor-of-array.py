class Solution:
    def findGCD(self, nums: List[int]) -> int:
        a=min(nums)
        b=max(nums)
        while(b!=0):
            rem=a%b
            a=b
            b=rem
        return a