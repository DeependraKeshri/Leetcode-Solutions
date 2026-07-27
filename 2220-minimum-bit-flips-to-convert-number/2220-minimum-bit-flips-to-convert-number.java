class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int count=0;
        for(int i=0; i<32; i++){
            if((xor & (1<<i))!=0)count++;
        }
        return count;
    }
}