class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefixSum[]=new int[n];
        int suffixSum[]=new int[n];
        prefixSum[0]=nums[0];
        suffixSum[n-1]=nums[n-1];
        for(int i=1; i<n; i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
            suffixSum[n-i-1]=nums[n-i-1]+suffixSum[n-i];
        }
        for(int i=0; i<n; i++){
            if(prefixSum[i]==suffixSum[i])return i;
        }
        return -1;
    }
}