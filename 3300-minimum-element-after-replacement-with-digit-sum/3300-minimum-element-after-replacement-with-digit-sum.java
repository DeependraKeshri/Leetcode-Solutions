class Solution {
    public int minElement(int[] nums) {
        int mini=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int val=0;
            while(nums[i]>0){
                val+=(nums[i]%10);
                nums[i]/=10;
            }
            if(val<mini)mini=val;
        }
        return mini;
    }
}