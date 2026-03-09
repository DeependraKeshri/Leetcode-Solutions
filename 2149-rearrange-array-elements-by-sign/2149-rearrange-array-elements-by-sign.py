class Solution:
    def rearrangeArray(self, nums: List[int]) -> List[int]:
        poslist=[]
        neglist=[]
        for i in nums:
            if i>0:
                poslist.append(i)
            else:
                neglist.append(i)
        i,j=0,0
        for k in range(len(nums)):
            if k%2==0:
                nums[k]=poslist[i]
                i+=1
            else:
                nums[k]=neglist[j]
                j+=1
        return nums