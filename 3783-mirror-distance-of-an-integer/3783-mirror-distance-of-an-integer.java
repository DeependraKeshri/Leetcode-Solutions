class Solution {
    public int mirrorDistance(int n) {
        int val=0, num=n;
        while(num>0){
            val=val*10+(num%10);
            num/=10;
        }
        return Math.abs(n-val);
    }
}