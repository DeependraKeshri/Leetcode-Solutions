class Solution:
    def palindrome(self, n):
        s = bin(n)[2:]  
        start = 0
        end = len(s) - 1
        
        while start < end:
            if s[start] != s[end]:
                return False
            start += 1
            end -= 1
        
        return True

    def isStrictlyPalindromic(self, n: int) -> bool:
        num = n
        
        for i in range(2, n-1):
            if num == 0:
                return False
            if not self.palindrome(num):
                return False
            num //= 2
        
        return True