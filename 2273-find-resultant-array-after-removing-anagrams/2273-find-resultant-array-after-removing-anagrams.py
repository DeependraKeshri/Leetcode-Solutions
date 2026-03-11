class Solution:
    def removeAnagrams(self, words: List[str]) -> List[str]:
        res = []
        prev = ""
        
        for word in words:
            s = ''.join(sorted(word))
            
            if s != prev:
                prev = s
                res.append(word)
                
        return res