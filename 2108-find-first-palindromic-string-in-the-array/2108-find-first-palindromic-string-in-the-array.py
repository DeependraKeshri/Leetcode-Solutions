class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        for i in words:
            s,e=0,len(i)-1
            while(s<e):
                if i[s]!=i[e]:
                    break
                s+=1
                e-=1
            if s>=e:
                return i
        return ""