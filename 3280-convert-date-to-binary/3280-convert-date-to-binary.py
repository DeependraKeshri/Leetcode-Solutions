class Solution:
    def convertDateToBinary(self, date: str) -> str:
        l=list(date.split('-'))
        for i in range(len(l)):
            l[i]=bin(int(l[i]))[2:]
        s=""
        for i in range(len(l)):
            if i==len(l)-1:
                s+=l[i]
            else:
                s+=l[i]+"-"
        return s