class Solution:
    def bitwiseComplement(self, n: int) -> int:
        if n==0:
            return 1
        i=0
        num=n
        while(i<31):
            val=1<<i
            if(val>n):
                break
            num^=val
            i+=1
        return num