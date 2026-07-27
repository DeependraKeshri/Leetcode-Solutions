class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int count=0;
        while(xor>0){
            if(xor%2==1)count++;
            xor/=2;
        }
        return count;
    }
}