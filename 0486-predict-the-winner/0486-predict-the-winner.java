class Solution {
    public boolean predictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1, 0, 0, true);
    }
    public boolean helper(int[] nums, int i, int j, int p1, int p2, boolean turn) {
        if (i > j) {
            return p1 >= p2;
        }
        if (turn) {
            return helper(nums, i + 1, j, p1 + nums[i], p2, false)
                || helper(nums, i, j - 1, p1 + nums[j], p2, false);
        } else {
            return helper(nums, i + 1, j, p1, p2 + nums[i], true)
                && helper(nums, i, j - 1, p1, p2 + nums[j], true);
        }
    }
}