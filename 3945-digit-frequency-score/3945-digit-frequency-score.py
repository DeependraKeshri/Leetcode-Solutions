class Solution:
    def digitFrequencyScore(self, n: int) -> int:
        s=set()
        num=str(n)
        sum=0
        for i in num:
            if i not in s:
                sum+=(num.count(i)*(int)(i))
                s.add(i)
        return sum