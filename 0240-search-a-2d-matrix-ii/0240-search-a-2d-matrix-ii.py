class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        s=0
        e=len(matrix[0])-1
        while(s<len(matrix) and e>=0):
            if target==matrix[s][e]:
                return True
            elif target>matrix[s][e]:
                s+=1
            else:
                e-=1
        return False