class Solution:
    def reversePrefix(self, s: str, k: int) -> str:
        str=s[k-1::-1]+s[k:]
        return str