class Solution:
    def sumAndMultiply(self, n: int) -> int:
        num,sum=0,0
        for i in str(n):
            if(int(i)!=0):
                num*=10
                num+=(int(i))
                sum+=int(i)
        num*=sum
        return num