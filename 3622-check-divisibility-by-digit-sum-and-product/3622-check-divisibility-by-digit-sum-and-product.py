class Solution:
    def checkDivisibility(self, n: int) -> bool:
        val=n
        sum,prod=0,1
        while(val>0):
            v=int(val%10)
            val/=10
            val=int(val)
            sum+=v
            prod*=v
        sum+=prod
        return n%sum==0