class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int val=(start-i);
                if(val<0)val*=(-1);
                if(val<ans)ans=val;
            }
        }
        return ans;
    }
}