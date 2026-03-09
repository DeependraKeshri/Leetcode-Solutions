class Solution:
    def arithmeticTriplets(self, nums: List[int], diff: int) -> int:
        count=0
        for i in nums:
            if i+diff in nums:
                if i+diff+diff in nums:
                    count+=1
        return count