class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        ans=list(list())
        for i in range(0,numRows):
            l=list()
            for j in range(0,i+1):
                if j==0 or j==i:
                    l.append(1)
                else:
                    val=ans[i-1][j-1]+ans[i-1][j]
                    l.append(val)
            ans.append(l)
        return ans