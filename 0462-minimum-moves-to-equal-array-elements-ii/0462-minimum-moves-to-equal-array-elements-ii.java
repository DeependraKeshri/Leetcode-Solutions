class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count=0, mid=nums[nums.length/2];
        for(int val:nums){
            count+=Math.abs(val-mid);
        }
        return count;
    }
}