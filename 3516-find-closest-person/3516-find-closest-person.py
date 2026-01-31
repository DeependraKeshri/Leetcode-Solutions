class Solution:
    def findClosest(self, x: int, y: int, z: int) -> int:
        w1=abs(x-z)
        w2=abs(y-z)
        if w1<w2:
            return 1
        elif w1>w2:
            return 2
        else:
            return 0