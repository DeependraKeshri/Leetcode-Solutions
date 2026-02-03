class Solution:
    def isTrionic(self, nums: List[int]) -> bool:
        point1 = False
        point2 = False
        pt1 = -1
        pt2 = -1

        for i in range(len(nums) - 1):
            if nums[i] == nums[i+1]:
                return False

        for i in range(1, len(nums) - 1):
            if nums[i-1] < nums[i] and nums[i] > nums[i+1]:
                if pt1 == -1:
                    pt1 = i
                    point1 = True
                else:
                    return False
            elif nums[i-1] > nums[i] and nums[i] < nums[i+1]:
                if pt2 == -1:
                    pt2 = i
                    point2 = True
                else:
                    return False

        if point1 and point2 and pt1 < pt2:
            return True
        else:
            return False
