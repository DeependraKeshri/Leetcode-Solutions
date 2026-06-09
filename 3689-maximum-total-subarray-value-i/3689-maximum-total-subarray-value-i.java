class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max=nums[0], min=nums[0];
        for(long i:nums){
            if(i>max)max=i;
            if(i<min)min=i;
        }
        long ans=k*(max-min);
        return ans;
    }
}