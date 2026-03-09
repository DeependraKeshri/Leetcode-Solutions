class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        idx=word.find(ch)
        s=""
        if idx!=-1:
            s=word[idx:0:-1]
            s+=word[0]
        st=s+word[idx+1:]
        return st