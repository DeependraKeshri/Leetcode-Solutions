class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans=1, sm=1, la=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                la++;
                sm=1;
            }else if(nums[i]<nums[i-1]){
                sm++;
                la=1;
            }else if(nums[i]==nums[i-1]){
                ans=Math.max(ans,Math.max(la,sm));
                la=1;
                sm=1;
            }
            ans=Math.max(ans,Math.max(la,sm));
        }
        return ans;
    }
}