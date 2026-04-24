class Solution:
    def furthestDistanceFromOrigin(self, moves: str) -> int:
        countLeft, countRight,count=0,0,0
        for i in moves:
            if i=='R':
                countRight+=1
            elif i=='L':
                countLeft+=1
            else:
                count+=1
        ans=abs(countLeft-countRight)+count
        return ans