class Solution:
    def maxProduct(self, n: int) -> int:
        first=-1
        second=-1
        num=n
        while (num>0):
            if num%10>first:
                first=num%10
            num/=10
            num=int(num)
        num=n
        c=0
        while num>0:
            val=num%10
            if val>second:
                if val==first:
                    c+=1
                else :
                    second=val
            num/=10
            num=int(num)
        if c>1:
            return first*first
        return first*second