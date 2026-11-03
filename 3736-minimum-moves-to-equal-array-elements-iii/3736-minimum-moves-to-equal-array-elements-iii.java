class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int val:nums){
            if(val>max)max=val;
        }
        int count=0;
        for(int val:nums){
            count+=(Math.abs(val-max));
        }
        return count;
    }
}