class Solution:
    def limitOccurrences(self, nums: list[int], k: int) -> list[int]:
        count=0
        ans=list()
        i=0
        while(i<len(nums)):
            j,val=i,nums[i]
            while(j<len(nums) and val==nums[j]):
                if count<k:
                    ans.append(nums[j])
                count+=1
                j+=1
                i+=1
            count=0
        return ans