class Solution:
    def closestTarget(self, words: List[str], target: str, startIndex: int) -> int:
        if target not in words:
            return -1
        lt,rt=0,0
        s=startIndex
        while words[s] != target:
            s+=1
            rt+=1
            if s==len(words):
                s=0
        s=startIndex
        while words[s] != target:
            s-=1
            lt+=1
            if s==-1:
                s=len(words)-1
        return min(lt,rt)