class Solution:
    def findGCD(self, nums: List[int]) -> int:
        a=-1000
        b=1000
        for i in nums:
            if a<i:
                a=i
            if b>i:
                b=i

        while(b!=0):
            rem=a%b
            a=b
            b=rem
        return a