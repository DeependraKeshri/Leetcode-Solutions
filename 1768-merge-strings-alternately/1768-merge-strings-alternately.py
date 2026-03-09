class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        s,e=0,0
        ans=""
        while(s<len(word1) and e<len(word2)):
            ans+=word1[s]
            ans+=word2[e]
            s+=1
            e+=1
        if(s==len(word1)):
            ans+=word2[e:]
        else:
            ans+=word1[s:]
        return ans