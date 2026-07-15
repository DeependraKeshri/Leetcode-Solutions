class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s=set()
        for i in nums:
            s.add(i)
        ans=0
        for i in s:
            if i-1 not in s:
                num=i
                while(num in s):
                    num+=1
                if num-i>ans:
                    ans=num-i
        return ans