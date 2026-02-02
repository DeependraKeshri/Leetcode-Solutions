class Solution:
    def sumZero(self, n: int) -> List[int]:
        val=int(n/2)
        lst=[]
        if(n%2==1):
            lst=list(range(-val,val+1))
        else:
            l1=list(range(-val,0))
            l2=list(range(1,val+1))
            lst=l1+l2
        return lst