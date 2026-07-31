class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int val: nums)xor^=val;
        int rt=(xor&(xor-1))^xor;
        int a=0, b=0;
        for(int val:nums){
            if((val&rt)!=0){
                a^=val;
            }else{
                b^=val;
            }
        }
        return new int[]{a,b};
    }
}