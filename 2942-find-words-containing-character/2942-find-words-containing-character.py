class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        list=[]
        for i in range(len(words)):
            if x in words[i]:
                list.append(i)
        return list