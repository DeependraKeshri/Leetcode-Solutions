class Solution:
    def maxFreqSum(self, s: str) -> int:
        maxvow=0
        maxcon=0
        for i in s:
            if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u'):
                if maxvow<s.count(i):
                    maxvow=s.count(i)
            else:
                if maxcon<s.count(i):
                    maxcon=s.count(i)
        return maxcon+maxvow