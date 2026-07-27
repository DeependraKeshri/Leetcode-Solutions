class Solution:
    def largestInteger(self, n: int, s: int) -> int:
        if n==0:
            return 0
        if s>9*n:
            return -1
        ans=""
        for i in range(n):
            digit=min(s,9)
            ans+=(str)(digit)
            s-=digit
        return (int)(ans)