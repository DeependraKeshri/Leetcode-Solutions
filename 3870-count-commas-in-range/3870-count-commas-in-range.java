class Solution {
    public int countCommas(int n) {
        int count=0, base=1000;
        while(base<=n){
            count+=(n-base+1);
            base*=1000;
        }
        return count;
    }
}