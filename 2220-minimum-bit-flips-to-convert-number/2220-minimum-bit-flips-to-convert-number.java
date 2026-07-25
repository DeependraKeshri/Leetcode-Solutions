class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start ^ goal;
        int count=0;
        while(ans>1){
            if(ans%2==1)count++;
            ans/=2;
        }
        if(ans==1)count++;
        return count;
    }
}