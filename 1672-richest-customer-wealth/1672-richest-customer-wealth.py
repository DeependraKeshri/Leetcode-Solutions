class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max=0
        for i in accounts:
            s=sum(i)
            if(s>max):
                max=s
        return max