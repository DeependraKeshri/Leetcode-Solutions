class Solution {
    public int xorOperation(int n, int start) {
        int i=0;
        int xor=0;
        while(i<n){
            int val=start+2*i;
            xor^=val;
            i++;
        }
        return xor;
    }
}