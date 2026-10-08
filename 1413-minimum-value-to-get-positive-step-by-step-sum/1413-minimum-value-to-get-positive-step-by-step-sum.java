class Solution {
    public int minStartValue(int[] nums) {
        int minval=nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i]+=nums[i-1];
            if(nums[i]<minval)minval=nums[i];
        }
        if(minval<=0){
            minval=(-1)*minval+1;
        }else{
            minval=1;
        }
        return minval;
    }
}