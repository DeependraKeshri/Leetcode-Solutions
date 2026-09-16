class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        l=[first]
        for i in range(len(encoded)):
            first^=encoded[i]
            l.append(first)
        return l