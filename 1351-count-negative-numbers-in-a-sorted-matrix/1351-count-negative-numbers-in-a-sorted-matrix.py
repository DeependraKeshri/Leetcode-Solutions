class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        c=0
        for i in range(len(grid)):
            s=int(0)
            e=int(len(grid[i])-1)
            while(s<=e):
                m=(int)(e+s)//2
                if(grid[int(i)][int(m)]<0):
                    e=m-1
                else:
                    s=m+1
            c+=(len(grid[int(i)])-int(s))
        return c