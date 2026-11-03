class Solution {
    public int minMergedInteger(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i+=2){
            int val=nums[i+1], mul=10;
            while((val/mul)>0){
                mul*=10;
            }
            if(nums[i]*mul+nums[i+1]<min)min=nums[i]*mul+nums[i+1];
        }
        return min;
    }
}