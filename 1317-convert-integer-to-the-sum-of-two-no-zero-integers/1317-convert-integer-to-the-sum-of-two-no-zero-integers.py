class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        lst=[]
        for i in range(1,n):
            val1=str(i)
            val2=str(n-i)
            if '0' not in val1 and '0' not in val2:
                lst.append(i)
                lst.append(n-i)
                return lst
        