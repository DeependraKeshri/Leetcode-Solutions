class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        countLeft=moves.count('L')
        countRight=moves.count('R')
        count=moves.count('_')
        ans=abs(countLeft-countRight)+count
        return ans