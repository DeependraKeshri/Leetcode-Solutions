class Solution {
    public int[] evenOddBit(int n) {
        int even=0, odd=0;
        int i=0;
        while((1<<i)<=n){
            if(i%2==0){
                if((n & (1<<i))>0)even++;
            }else{
                if((n & (1<<i))>0)odd++;
            }
            i++;
        }
        return new int[]{even, odd};
    }
}