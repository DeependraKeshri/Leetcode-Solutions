class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int i=0; i<nums.length; i++){
            xor^=nums[i];
        }
        int rightmost=(xor&(xor-1))^xor;
        int ans[]=new int[2];
        for(int i=0; i<nums.length; i++){
            if((nums[i]&rightmost)!=0)ans[0]^=nums[i];
            else ans[1]^=nums[i];
        }
        return ans;
    }
}