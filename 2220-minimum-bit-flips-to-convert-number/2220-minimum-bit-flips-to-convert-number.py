class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        count=0
        xor=goal^start
        while xor>0:
            if xor%2==1:
                count+=1
            xor=int(xor/2)
        return count