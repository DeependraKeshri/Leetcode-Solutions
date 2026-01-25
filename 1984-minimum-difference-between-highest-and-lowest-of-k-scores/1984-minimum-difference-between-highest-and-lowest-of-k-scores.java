class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int diff=nums[k-1]-nums[0];
        for(int i=k; i<nums.length; i++){
            int d=nums[i]-nums[i-k+1];
            if(d<diff)diff=d;
        }
        return diff;
    }
}