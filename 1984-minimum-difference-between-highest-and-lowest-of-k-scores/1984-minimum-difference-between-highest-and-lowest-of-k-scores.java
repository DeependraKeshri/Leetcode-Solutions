class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int hi=nums[k-1];
        int lo=nums[0];
        int diff=hi-lo;
        for(int i=k; i<nums.length; i++){
            hi=nums[i];
            lo=nums[i-k+1];
            int d=hi-lo;
            if(d<diff)diff=d;
        }
        return diff;
    }
}