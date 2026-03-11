class Solution:
    def hasIncreasingSubarrays(self, nums: List[int], k: int) -> bool:
        for i in range(0,len(nums)-2*k+1):
            val=True
            for j in range(i+1,i+k):
                if(nums[j-1]>=nums[j]):
                    val=False
                    break
            if val:
                for l in range(i+k+1,i+2*k):
                    if(nums[l-1]>=nums[l]):
                        val=False
                        break
            if val:
                return True
        return False