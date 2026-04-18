class Solution:
    def mirrorDistance(self, n: int) -> int:
        num,val=n,0
        while num>0:
            val=val*10+(num%10)
            num//=10
        return abs(n-val)