class Solution {
    public int[] evenOddBit(int n) {
        boolean turn=true;
        int even=0, odd=0;
        while(n>0){
            if(turn){
                turn=false;
                if(n%2==1)even++;
            }else{
                turn=true;
                if(n%2==1)odd++;
            }
            n/=2;
        }
        return new int[]{even, odd};
    }
}