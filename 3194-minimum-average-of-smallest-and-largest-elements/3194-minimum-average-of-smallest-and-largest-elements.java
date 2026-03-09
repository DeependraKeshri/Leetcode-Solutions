class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans=Integer.MAX_VALUE;
        int s=0, e=nums.length-1;
        while(s<e){
            double avg=(double)(nums[s]+nums[e])/2;
            if(ans>avg)ans=avg;
            s++;
            e--;
        }
        return ans;
    }
}