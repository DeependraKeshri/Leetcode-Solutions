class Solution:
    def removeCoveredIntervals(self, intervals: List[List[int]]) -> int:
        lst=[]
        for i in range(0, len(intervals)):
            lst.append(False)
        
        for i in range(0,len(intervals)):
            for j in range(0, len(intervals)):
                if i!=j and lst[i]==False:
                    if intervals[i][0]<=intervals[j][0] and intervals[j][1]<=intervals[i][1]:
                        lst[j]=True
        count=0
        for i in lst:
            if i:
                count+=1
        return len(lst)-count
