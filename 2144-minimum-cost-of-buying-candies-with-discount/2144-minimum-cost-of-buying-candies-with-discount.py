class Solution:
    def minimumCost(self, cost: List[int]) -> int:
        cost.sort()
        i=len(cost)-1
        sum=0
        while i>=0:
            if i-1<0:
                sum+=cost[i]
                break
            sum+=(cost[i]+cost[i-1])
            i-=3
        return sum