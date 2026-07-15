class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        arr1=list(s)
        arr2=list(t)
        arr1.sort()
        arr2.sort()
        return arr1==arr2