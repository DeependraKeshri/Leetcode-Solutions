class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int num=nums[0];
        int prefix[]=new int[nums.length];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>num)num=nums[i];
            prefix[j++]=gcd(nums[i],num);
        }
        Arrays.sort(prefix);
        int s=0, e=nums.length-1;
        long sum=0;
        while(s<e){
            sum+=(long)gcd(prefix[s],prefix[e]);
            s++;
            e--;
        }
        return sum;
    }
}