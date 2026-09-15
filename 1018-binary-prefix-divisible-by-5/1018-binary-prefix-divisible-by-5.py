class Solution:
    def prefixesDivBy5(self, nums: List[int]) -> List[bool]:
        num=0
        l=[]
        for i in nums:
            num=int((num*2+i)%5)
            if num%5==0:
                l.append(True)
            else:
                l.append(False)
        return l