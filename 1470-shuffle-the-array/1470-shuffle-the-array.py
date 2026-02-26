class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        list=[]
        e=0
        o=n
        for i in range(len(nums)):
            if i%2==0:
                list.append(nums[e])
                e+=1
            else:
                list.append(nums[o])
                o+=1
        return list