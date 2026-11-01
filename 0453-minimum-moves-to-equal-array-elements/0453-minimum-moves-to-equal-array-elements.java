class Solution {
    public int minMoves(int[] nums) {
        int min = findMin(nums, 0, nums[0]);
        return calculateMoves(nums, 0, min);
    }
    public int findMin(int[] nums, int i, int min) {
        if (i == nums.length) return min;
        min = Math.min(min, nums[i]);
        return findMin(nums, i + 1, min);
    }
    public int calculateMoves(int[] nums, int i, int min) {
        if (i == nums.length) return 0;
        return (nums[i] - min) + calculateMoves(nums, i + 1, min);
    }
}