class Solution {
    public int findGCD(int[] nums) {
        int a=Integer.MAX_VALUE, b=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(a>nums[i])a=nums[i];
            if(b<nums[i])b=nums[i];
        }
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}