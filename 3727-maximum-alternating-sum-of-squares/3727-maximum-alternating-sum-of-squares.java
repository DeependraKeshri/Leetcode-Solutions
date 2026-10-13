class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]<0)nums[i]*=-1;
        }
        Arrays.sort(nums);
        int e=n-1, s=0;
        long sum=0;
        while(s<e){
            sum+=(nums[e]*nums[e]);
            sum-=(nums[s]*nums[s]);
            s++;
            e--;
        }
        if(s==e)sum+=(nums[s]*nums[s]);
        return sum;
    }
}