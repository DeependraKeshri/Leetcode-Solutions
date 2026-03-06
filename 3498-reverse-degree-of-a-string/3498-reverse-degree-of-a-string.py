class Solution:
    def reverseDegree(self, s: str) -> int:
        l=[]
        for i in range(26):
            l.append(26-i)
        sum=0
        for i in range(len(s)):
            sum+=(i+1)*(l[ord(s[i])-ord('a')])
        return sum