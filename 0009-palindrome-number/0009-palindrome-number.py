class Solution:
    def isPalindrome(self, x: int) -> bool:
        n,num=0,x
        while(num>0):
            n=n*10+num%10
            num//=10
        return n==x