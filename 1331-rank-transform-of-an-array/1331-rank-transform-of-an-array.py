class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        list=arr.copy()
        list.sort()
        j=1
        d={}
        for i in range(0, len(list)):
            if list[i] not in d:
                d[list[i]]=j
                j+=1
        for i in range(0, len(arr)):
            arr[i]=d[arr[i]]
        return arr