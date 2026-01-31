class Solution:
    def maxDistinct(self, s: str) -> int:
        st=set(s)
        return len(st)