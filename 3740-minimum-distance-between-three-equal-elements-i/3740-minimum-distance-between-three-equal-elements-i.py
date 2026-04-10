class Solution:
    def minimumDistance(self, nums: List[int]) -> int:
        count=100000
        for i in range(len(nums)-2):
            for j in range(i+1, len(nums)-1):
                if nums[i]==nums[j]:
                    for k in range(j+1, len(nums)):
                        if nums[j]==nums[k]:
                            val=(j-i)+(k-i)+(k-j)
                            if val<count:
                                count=val
                                break

        if count==100000:
            return -1
        return count