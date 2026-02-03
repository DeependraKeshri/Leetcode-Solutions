class Solution {
    public boolean isTrionic(int[] nums) {
        boolean point1 = false;
        boolean point2 = false;
        int pt1 = -1;
        int pt2 = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return false;
            }
        }

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i - 1] < nums[i] && nums[i] > nums[i + 1]) {
                if (pt1 == -1) {
                    pt1 = i;
                    point1 = true;
                } else {
                    return false;
                }
            } else if (nums[i - 1] > nums[i] && nums[i] < nums[i + 1]) {
                if (pt2 == -1) {
                    pt2 = i;
                    point2 = true;
                } else {
                    return false;
                }
            }
        }

        if (point1 && point2 && pt1 < pt2) {
            return true;
        } else {
            return false;
        }
    }
}
