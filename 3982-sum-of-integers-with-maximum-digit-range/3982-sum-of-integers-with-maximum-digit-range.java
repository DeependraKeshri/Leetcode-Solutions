class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int digit[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int val=nums[i];
            int lar=Integer.MIN_VALUE;
            int sm=Integer.MAX_VALUE;
            while(val>0){
                int v=val%10;
                if(v>lar)lar=v;
                if(v<sm)sm=v;
                val/=10;
            }
            digit[i]=lar-sm;
            if(digit[i]>max)max=digit[i];
        }
        int ans=0;
        for(int i=0; i<n; i++){
            if(digit[i]==max)ans+=nums[i];
        }
        return ans;
    }
}