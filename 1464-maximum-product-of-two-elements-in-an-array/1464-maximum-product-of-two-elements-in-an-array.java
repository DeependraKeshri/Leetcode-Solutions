class Solution {
    public int maxProduct(int[] nums) {
        int firstMax=nums[0], idx=0;
        int secondMax=Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(firstMax<nums[i]){
                firstMax=nums[i];
                idx=i;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(secondMax<nums[i] && idx!=i)secondMax=nums[i];
        }
        return (firstMax-1)*(secondMax-1);
    }
}