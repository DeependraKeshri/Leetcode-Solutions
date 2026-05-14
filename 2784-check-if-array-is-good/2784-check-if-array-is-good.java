class Solution {
    public boolean isGood(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]>max)max=nums[i];
        }
        if(max>=n)return false;
        int check[]=new int[n];
        for(int i=0; i<n; i++){
            check[nums[i]]++;
        }
        for(int i=1; i<n-1; i++){
            if(check[i]!=1)return false;
        }
        return check[n-1]==2;
    }
}