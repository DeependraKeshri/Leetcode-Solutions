class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        int n=nums.length;
        for(int i=0; i<n; i++){
            xor^=nums[i];
        }
        int rt=(xor & (xor-1))^xor;
        int a=0, b=0;
        for(int i=0; i<n; i++){
            if((nums[i] & rt)!=0)a^=nums[i];
            else b^=nums[i];
        }
        return new int[]{a,b};
    }
}