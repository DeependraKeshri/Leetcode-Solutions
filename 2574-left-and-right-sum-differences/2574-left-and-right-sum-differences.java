class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
        }
        int lt=0;
        for(int i=0; i<nums.length; i++){
            sum-=nums[i];
            int val=nums[i];
            nums[i]=Math.abs(sum-lt);
            lt+=val;
        }
        return nums;
    }
}